package com.common.platform.gateway;

import com.common.platform.gateway.coder.BroadcastProtocol;
import com.common.platform.gateway.protocol.ProtocolConst;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/*
 * 连接建立与断开后，各个函数依次执行顺序，可参考GatewaySocketHandler类来执行
 */
public class BroadcastSocketHandler extends SimpleChannelInboundHandler<BroadcastSocketHandler> {

	@Override
	protected void channelRead0(ChannelHandlerContext ctx, BroadcastSocketHandler msg) throws Exception {
		System.out.println(msg.toString());
	}

	@Override
	public void channelActive(ChannelHandlerContext ctx) throws Exception {
		System.out.println("one client is connect to the server -------");

		byte[] b = new byte[] { (byte) 70 };
		BroadcastProtocol broadcastProtocol = new BroadcastProtocol.Builder()
				.data(b)
				.command(ProtocolConst.UPDATE_VOL)
				.len((short) 1)
				.build();
		ctx.channel().writeAndFlush(broadcastProtocol);
	}

	@Override
	public void channelInactive(ChannelHandlerContext ctx) throws Exception {
		// super.channelInactive(ctx);
		System.out.println("one client is disconnect to the server-----");
	}

	@Override
	public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
		// super.channelReadComplete(ctx);
		System.out.println("read complete---");
	}

}
