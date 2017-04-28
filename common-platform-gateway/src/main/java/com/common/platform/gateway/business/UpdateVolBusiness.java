package com.common.platform.gateway.business;

import com.common.platform.gateway.annotation.BroadcastBusiness;
import com.common.platform.gateway.protocol.ProtocolConst;

@BroadcastBusiness(broadcastCommand=ProtocolConst.UPDATE_VOL)
public class UpdateVolBusiness extends BusinessLogicBase{
	
	@Override
	public void processBusiness() {
		if(getProtocol() != null){
System.out.println("update the vol business-------");
			byte[] data = getProtocol().getData();
System.out.println("the data size is "+data.length);
			System.out.println("the current vol is "+(int)data[0]);
		}
	}
	
	public void updateVol(int vol){
		
	}
	
}
