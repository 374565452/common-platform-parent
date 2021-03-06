package com.common.platform.gateway;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.common.platform.gateway.manager.BusinessAndProtocolClassManager;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.util.concurrent.ImmediateEventExecutor;

@Component("gatewayServer")
@Scope("singleton")
public class GatewayServer implements Runnable{
	/** 用于分配处理业务线程的线程组个数 */
	public static final int BIZGROUPSIZE = 1; // 默认
	/** 业务出现线程大小 */
	public static final int BIZTHREADSIZE = Runtime.getRuntime().availableProcessors();
	
	private static Logger logger=Logger.getLogger(GatewayServer.class);
	
	private ChannelGroup group = new DefaultChannelGroup(ImmediateEventExecutor.INSTANCE);
	
	public ChannelGroup getGroup() {
		return group;
	}
	public void setGroup(ChannelGroup group) {
		this.group = group;
	}

	public void bind() {
		System.out.println("server start................");
		EventLoopGroup bossGroup = new NioEventLoopGroup(BIZGROUPSIZE);
		EventLoopGroup workGroup = new NioEventLoopGroup(BIZTHREADSIZE);
 
		try {
 
			//初始化业务处理类
			BusinessAndProtocolClassManager.initBusinessClass();
			BusinessAndProtocolClassManager.initProtocolTypeClass();
			
			ServerBootstrap b = new ServerBootstrap();
			b.group(bossGroup, workGroup);
			b.channel(NioServerSocketChannel.class);
			b.option(ChannelOption.SO_BACKLOG, 1024); //连接数
			b.option(ChannelOption.TCP_NODELAY, true);//不延迟，消 息立即发送
			b.option(ChannelOption.SO_KEEPALIVE,true); //长连接
			b.childHandler(new GatewayChannelHandler(this));
			
			// 绑定端口
			ChannelFuture f = b.bind(7002).sync();
			
			String info =String.format("the web server is start at port %d", 9999);
			logger.info(info);
			System.out.println(info);
			// 等待服务端监听端口关闭
			f.channel().closeFuture().sync();
 
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("exit in the system-----------------------");
			// 优雅的退出
			bossGroup.shutdownGracefully();
			workGroup.shutdownGracefully();
		}
 
	}
	
	public static void main(String[] args) {
		logger.info("-------------system starting-----------------");
		new GatewayServer().bind();
	}
	@Override
	public void run() {
		this.bind();
	}
}
