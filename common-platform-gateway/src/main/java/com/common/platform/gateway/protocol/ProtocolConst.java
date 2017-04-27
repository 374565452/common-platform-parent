package com.common.platform.gateway.protocol;

public interface ProtocolConst {
	public static byte PROTOCOL_HAEDER=(byte)0xAA;
	public static byte PROTOCOL_TAIL=0x55;
	
	public static int PROTOCOL_MIN_LEN=8;
	
	public static short UPDATE_VOL=0x1501;
}
