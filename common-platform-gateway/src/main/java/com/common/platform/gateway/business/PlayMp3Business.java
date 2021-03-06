package com.common.platform.gateway.business;

import com.common.platform.gateway.annotation.BroadcastBusiness;
import com.common.platform.gateway.coder.BroadcastProtocol;
import com.common.platform.gateway.protocol.ProtocolConst;
import com.common.platform.utils.Mp3FileUtil;

@BroadcastBusiness(broadcastCommand = ProtocolConst.PLAY_MP3)
public class PlayMp3Business extends BusinessLogicBase {

	@Override
	public void processBusiness() {
		if (getProtocol() == null) {
			System.out.println("--------------start play mp3--------");
		} else {
			// 从网络中获取到的数据
			byte[] data = getProtocol().getData();
			System.out.println("the play mp3 return data is --" + (int) ((int) (data[0] << 8) + (int) data[1])
					+ "  the length is -- " + data.length);
		}
		try {
			byte[] mp3Data = Mp3FileUtil.getInstance().readFile(8192);
			if (mp3Data != null) {
				BroadcastProtocol bp = new BroadcastProtocol.Builder().data(mp3Data).len((short) mp3Data.length)
						.command(ProtocolConst.PLAY_MP3).build();
				if (getSession() != null) {
					getSession().writeAndFlush(bp);
				}
			}else{
				//此次没有读取到数据
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
