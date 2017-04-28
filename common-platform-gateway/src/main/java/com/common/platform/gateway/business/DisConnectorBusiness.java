package com.common.platform.gateway.business;

import com.common.platform.gateway.annotation.BroadcastBusiness;
import com.common.platform.gateway.protocol.ProtocolConst;

@BroadcastBusiness(broadcastCommand=ProtocolConst.DIS_CONNECTOR)
public class DisConnectorBusiness extends BusinessLogicBase{

	@Override
	public void processBusiness() {
System.out.println("--------退出业务执行逻辑------");
	}

}
