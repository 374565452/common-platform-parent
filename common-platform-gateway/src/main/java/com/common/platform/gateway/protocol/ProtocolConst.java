package com.common.platform.gateway.protocol;

public interface ProtocolConst {
	public static byte PROTOCOL_HAEDER=(byte)0xAA;
	public static byte PROTOCOL_TAIL=0x55;
	
	public static int PROTOCOL_MIN_LEN=8;
	
	public static short CREATE_CONNECTOR=Short.MAX_VALUE; //成功建立TCP/IP连接时命令
	public static short DIS_CONNECTOR=Short.MIN_VALUE;  //断开TCP/IP连接时命令
	
	public static short UPDATE_VOL=0x1501;
	public static short PLAY_MP3=0x1502;
}
