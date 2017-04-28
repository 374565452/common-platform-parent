package com.common.platform.gateway.business;

import com.common.platform.gateway.coder.BroadcastProtocol;
import com.common.platform.gateway.manager.BroadcastSession;

public abstract class BusinessLogicBase implements Runnable{
	
	public BroadcastSession session;
	
	public BroadcastProtocol protocol;
	
	public BusinessLogicBase(){
		
	}
	
	public BusinessLogicBase(BroadcastSession session, BroadcastProtocol protocol) {
		this.session = session;
		this.protocol = protocol;
	}
	
	public BroadcastSession getSession() {
		return session;
	}

	public void setSession(BroadcastSession session) {
		this.session = session;
	}

	public BroadcastProtocol getProtocol() {
		return protocol;
	}

	public void setProtocol(BroadcastProtocol protocol) {
		this.protocol = protocol;
	}

	public abstract void processBusiness();
	
	@Override
	public void run() {
		processBusiness();
	}
	
}
