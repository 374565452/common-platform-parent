package com.common.platform.gateway.business;

import com.common.platform.gateway.annotation.BroadcastBusiness;
import com.common.platform.gateway.coder.BroadcastProtocol;
import com.common.platform.gateway.manager.BusinessLogicDispatcher;
import com.common.platform.gateway.protocol.ProtocolConst;
import com.common.platform.utils.Mp3FileUtil;

@BroadcastBusiness(broadcastCommand = ProtocolConst.CREATE_CONNECTOR)
public class SuccessConnectorBusiness extends BusinessLogicBase {

	public String filePath="d:\\123.mp3";
	@Override
	public void processBusiness() {
		// 成功建立连接后，发送修改音量指令
		System.out.println("connector is successful --------------------");
		/*byte[] b = new byte[] { (byte) 70 };
		BroadcastProtocol broadcastProtocol = new BroadcastProtocol.Builder().
				data(b).command(ProtocolConst.UPDATE_VOL)
				.len((short) 1).build();*/
		
		if(getSession() !=null){
			//getSession().writeAndFlush(broadcastProtocol);
			//直接发送播放mp3指令
			try {
				Mp3FileUtil.getInstance().initStream(filePath);
				BusinessLogicDispatcher.submit(getSession(), ProtocolConst.PLAY_MP3);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
