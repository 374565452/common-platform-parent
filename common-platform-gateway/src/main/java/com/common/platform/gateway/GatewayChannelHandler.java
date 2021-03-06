package com.common.platform.gateway;

import com.common.platform.gateway.coder.BroadcastDecoder;
import com.common.platform.gateway.coder.BroadcastEncoder;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;

public class GatewayChannelHandler extends ChannelInitializer<SocketChannel>{
	private GatewayServer gServer;

	public GatewayChannelHandler(GatewayServer nettyServer) {
		this.gServer = nettyServer;
	}

	@Override
	protected void initChannel(SocketChannel ch) throws Exception {
		//System.out.println("报告");
		//System.out.println("信息：有一客户端链接到本服务端");
		//System.out.println("IP:" + ch.localAddress().getHostName());
		//System.out.println("Port:" + ch.localAddress().getPort());
		//System.out.println("报告完毕");

		// 半包处理【基于换行符】
		// ch.pipeline().addLast(new LineBasedFrameDecoder(1024));
		/***
		 * 在这里要增加字符串类型解码器，因为MyServerHanlder中所需要的数据类型为string
		 * 如果不增加任务类型的解码器时，数据类型为byteBuf类型的 但是这个数据在不进行解码时它是ByteBuf类型的后面例子我们在介绍
		 */
		// 字符串编码
		// ch.pipeline().addLast(new StringDecoder());
		// 字符串解码
		// ch.pipeline().addLast(new StringEncoder());
		// 在管道中添加我们自己的接收数据实现方法
		// ch.pipeline().addLast(new MyServerHanlder());

		// 这里一定要加上编解码处理。否则会出@2016-05-19
		/*
		 * An exceptionCaught() event was fired, and it reached at the tail of
		 * the pipeline. It usually means the last handler in the pipeline did
		 * not handle the exception. java.lang.UnsupportedOperationException:
		 * direct buffer at io.netty.buffer.UnpooledUnsafeDirectByteBuf.array(
		 * UnpooledUnsafeDirectByteBuf.java:199) at
		 * io.netty.buffer.WrappedByteBuf.array(WrappedByteBuf.java:752) at
		 * com.netty.demo.server.ChannelInboundHandler.channelRead(
		 * ChannelInboundHandler.java:29) at
		 * io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(
		 * AbstractChannelHandlerContext.java:308) at
		 * io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(
		 * AbstractChannelHandlerContext.java:294) at
		 * io.netty.channel.DefaultChannelPipeline.fireChannelRead(
		 * DefaultChannelPipeline.java:846) at
		 * io.netty.channel.nio.AbstractNioByteChannel$NioByteUnsafe.read(
		 * AbstractNioByteChannel.java:131) at
		 * io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.
		 * java:511) at
		 * io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(
		 * NioEventLoop.java:468) at
		 * io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.
		 * java:382) at
		 * io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:354) at
		 * io.netty.util.concurrent.SingleThreadEventExecutor$2.run(
		 * SingleThreadEventExecutor.java:110) at io.netty.util.concurrent.
		 * DefaultThreadFactory$DefaultRunnableDecorator.run(
		 * DefaultThreadFactory.java:137) at
		 * java.lang.Thread.run(Thread.java:745)
		 */
		// 设置超时时间，读超时时间，写超时时间，读写超时时间
		// 如果想用心跳机制，则下面的一句话，一定要在channelInboundHandler之前添加
		// ch.pipeline().addLast(new IdleStateHandler(60, 20, 15,
		// TimeUnit.SECONDS));
		// ch.pipeline().addLast(new ByteToIntegerDecoder());
		// ch.pipeline().addLast(new IntegerToByteEncoder());
		//ch.pipeline().addLast("decoder", new StringDecoder());
		//ch.pipeline().addLast("encoder", new StringEncoder());
		//加上下面的解码器，是为了解决拆包与分包问题
		/**
		 * 加上ch.pipeline().addLast(new LengthFieldBasedFrameDecoder(16*1024, 3, 2,3,0));可以实现拆包与分包问题
		 * 16*1024 代表一包数据最长为16*1024
		 * 3 代表每一包数据从4个数据开始为后面数据的长度
		 * 2代表的是数据长度为占有2个字节
		 * 3代表占据这么长数据后面还有3个字节（CRC16 + 协议尾）
		 * 0忽略包头信息，返给上层时会去掉这部份bytes
		 * @2017-5-2 实现自己的编码器，解决拆包与分包问题
		 */
		//ch.pipeline().addLast(new LengthFieldBasedFrameDecoder(16*1024, 3, 2,3,0));
		ch.pipeline().addLast("decoder", new BroadcastDecoder());
		ch.pipeline().addLast("encoder", new BroadcastEncoder());
		//ch.pipeline().addLast(new ChannelInboundHandler(this.nettyServer.getGroup()));
		//ch.pipeline().addLast(new GatewaySocketHandler(this.gServer.getGroup()));
		ch.pipeline().addLast(new BroadcastSocketHandler());
	}

}
