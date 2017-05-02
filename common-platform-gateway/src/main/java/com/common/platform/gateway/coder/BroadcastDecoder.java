package com.common.platform.gateway.coder;

import java.util.List;

import com.common.platform.gateway.protocol.ProtocolConst;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;

public class BroadcastDecoder extends ByteToMessageDecoder {

	@Override
	protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
		int readLen = in.readableBytes();// 接收到的数据的长度
		// LengthFieldBasedFrameDecoder
		System.out.println(readLen);
		try {
			if (readLen > ProtocolConst.PROTOCOL_MIN_LEN) {
				//得到ByteBuf中缓冲区读取数据的索引处
				int readIndex = in.readerIndex();
System.out.println("========the readIndex is =============" + readIndex);
				/**
				 * 得到实际一个帧长中数据的实际长度
				 * getUnsignedShort获取数据长度，但ByteBuf中的索引不变化
				 * 与read不同，read读取数据后，索引值会跟着变化
				 */
				int actualFrameLength = in.getUnsignedShort(readIndex + 3);
System.out.println("=========the actualFrameLength is =========" + actualFrameLength);
				if (readLen >= (actualFrameLength + ProtocolConst.PROTOCOL_MIN_LEN)) 
				{
					byte readHeader = in.readByte();
					short readCommand = in.readShort();
					short readDataLen = in.readShort();
					ByteBuf readBytes = in.readBytes(readDataLen);
					// 通过以下方式byte数组与bytebuf来相互转换
					byte[] bs = new byte[readBytes.capacity()];
					readBytes.getBytes(0, bs);
					short crc = in.readShort();
					byte readTail = in.readByte();

					/*
					 * BroadcastProtocol bp = new BroadcastProtocol();
					 * bp.setHeader(readHeader); bp.setTail(readTail);
					 * bp.setCommand(readCommand); bp.setLen(readDataLen);
					 * bp.setData(bs); bp.setCrc16(crc);
					 */
					BroadcastProtocol bp = new BroadcastProtocol.Builder().header(readHeader).tail(readTail)
							.command(readCommand).len(readDataLen).crc16(crc).data(bs).build();
					// System.out.println(bp.toString());
					out.add(bp);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
