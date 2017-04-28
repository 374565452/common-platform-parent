package com.common.platform.gateway.manager;

import io.netty.channel.Channel;

public class BroadcastSession {

	private Channel channel;
	
	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}

	public BroadcastSession(Channel channel){
		this.channel=channel;
	}
	
	public void writeAndFlush(Object data){
		if(channel.isActive()){
			channel.writeAndFlush(data);
		}
	}
	
}
