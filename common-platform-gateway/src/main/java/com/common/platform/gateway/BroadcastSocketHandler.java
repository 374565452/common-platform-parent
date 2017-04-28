package com.common.platform.gateway;

import com.common.platform.gateway.coder.BroadcastProtocol;
import com.common.platform.gateway.manager.BroadcastSession;
import com.common.platform.gateway.manager.BroadcastSessionManager;
import com.common.platform.gateway.manager.BusinessLogicDispatcher;
import com.common.platform.gateway.protocol.ProtocolConst;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/*
 * 连接建立与断开后，各个函数依次执行顺序，可参考GatewaySocketHandler类来执行
 */
public class BroadcastSocketHandler extends SimpleChannelInboundHandler<BroadcastProtocol> {

	@Override
	protected void channelRead0(ChannelHandlerContext ctx, BroadcastProtocol msg) throws Exception {
System.out.println(msg.toString());
		int key=ctx.channel().hashCode();
		BroadcastSession session=BroadcastSessionManager.getInstance().getSession(key);
		if(session != null){
			BusinessLogicDispatcher.submit(session, msg);
		}
	}

	@Override
	public void channelActive(ChannelHandlerContext ctx) throws Exception {
		System.out.println("one client is connect to the server -------");

		/*byte[] b = new byte[] { (byte) 70 };
		BroadcastProtocol broadcastProtocol = new BroadcastProtocol.Builder()
				.data(b)
				.command(ProtocolConst.UPDATE_VOL)
				.len((short) 1)
				.build();
		ctx.channel().writeAndFlush(broadcastProtocol);*/
		//需要将此连接保存在SessionManager上
		BroadcastSession session=new BroadcastSession(ctx.channel());
		BroadcastSessionManager.getInstance().putSession(ctx.channel().hashCode(), session);
System.out.println(BroadcastSessionManager.getInstance().toString());	
		BusinessLogicDispatcher.submit(session, ProtocolConst.CREATE_CONNECTOR);
	}

	@Override
	public void channelInactive(ChannelHandlerContext ctx) throws Exception {
		// super.channelInactive(ctx);
System.out.println("one client is disconnect to the server-----");
		//解决bug问题
		//由于sessionMap是以ctx.channel().hashCode作为key来存值的
		//但是之前removeSession传的key值为ctx.hashCode，所以导致无法从sessionMap中真正的删除掉已经断开连接的对象
		BroadcastSession removeSession = BroadcastSessionManager.getInstance().removeSession(ctx.channel().hashCode());
		if(removeSession != null){
			//当有客户端退出时，要做相应的处理
			BusinessLogicDispatcher.submit(removeSession, ProtocolConst.DIS_CONNECTOR);
		}
System.out.println(BroadcastSessionManager.getInstance().toString());
	}

	@Override
	public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
		// super.channelReadComplete(ctx);
		System.out.println("read complete---");
	}

}
