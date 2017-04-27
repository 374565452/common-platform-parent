package com.common.platform.gateway.coder;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

public class BroadcastEncoder extends MessageToByteEncoder<BroadcastProtocol>{

	@Override
	protected void encode(ChannelHandlerContext ctx, BroadcastProtocol msg, ByteBuf out) throws Exception {
		byte[] realData = msg.realData();
		out.writeBytes(realData);
	}

}
