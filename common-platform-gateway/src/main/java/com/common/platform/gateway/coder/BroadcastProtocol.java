package com.common.platform.gateway.coder;

import com.common.platform.gateway.protocol.ProtocolConst;

/*
 * 0xAA + 命令（2个字节，高字节在前，低字节在后）+数据长度（2个字节，高字节在前，低字节在后）+数据+CRC16（高在前，低在后）+0x55
 */
public class BroadcastProtocol {

	private byte header;

	private byte tail;

	private short command;

	private short len;

	private short crc16;

	private byte[] data;

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	public BroadcastProtocol() {
		header = ProtocolConst.PROTOCOL_HAEDER;
		tail = ProtocolConst.PROTOCOL_TAIL;
	}

	public byte getHeader() {
		return header;
	}

	public void setHeader(byte header) {
		this.header = header;
	}

	public byte getTail() {
		return tail;
	}

	public void setTail(byte tail) {
		this.tail = tail;
	}

	public short getCommand() {
		return command;
	}

	public void setCommand(short command) {
		this.command = command;
	}

	public short getLen() {
		return len;
	}

	public void setLen(short len) {
		this.len = len;
	}

	public short getCrc16() {
		return crc16;
	}

	public void setCrc16(short crc16) {
		this.crc16 = crc16;
	}

	public byte[] realData() {
		int dataLen =0;
		if(data != null){
			dataLen=data.length;
		}
		int realDataLen = ProtocolConst.PROTOCOL_MIN_LEN + dataLen;
		byte[] rData = new byte[realDataLen];
		rData[0] = header;
		rData[1] = (byte) ((command >>> 8) & 0xFF);// >>>无符号右移
		rData[2] = (byte) (command & 0xFF);
		rData[3] = (byte) ((len >>> 8) & 0xFF);// >>>无符号右移
		rData[4] = (byte) (len & 0xFF);
		if(data != null){
			System.arraycopy(data, 0, rData, 5, dataLen);
		}
		rData[5 + dataLen] = (byte) ((crc16 >>> 8) & 0xFF);
		rData[6 + dataLen] = (byte) (crc16 & 0xFF);
		rData[7 + dataLen] = tail;
		return rData;
	}

	public static class Builder {
		private byte header = ProtocolConst.PROTOCOL_HAEDER;

		private byte tail = ProtocolConst.PROTOCOL_TAIL;

		private short command = 0;

		private short len = 0;

		private short crc16 = 0 ;

		private byte[] data = null;
		
		public Builder header(byte val){
			header=val;
			return this;
		}
		
		public Builder tail(byte val){
			tail=val;
			return this;
		}
		
		public Builder command(short val){
			command=val;
			return this;
		}
		
		public Builder len(short val){
			len=val;
			return this;
		}
		
		public Builder crc16(short val){
			crc16=val;
			return this;
		}
		
		public Builder data(byte[]val){
			data=val;
			return this;
		}
		public BroadcastProtocol build(){
			return new BroadcastProtocol(this);
		}
	}
	
	private BroadcastProtocol(Builder b){
		header=b.header;
		tail=b.tail;
		command=b.command;
		len=b.len;
		crc16=b.crc16;
		data=b.data;
	}
	
	@Override
	public String toString() {
		/*
		 * StringBuffer sb=new StringBuffer(); for(int i
		 * =0;i<arrays.length;i++){
		 * sb.append("0x"+Integer.toHexString((int)(arrays[i] & 0x000000ff)) +
		 * " "); }
		 */
		StringBuffer sb = new StringBuffer();
		byte[] datas = realData();
		for (int i = 0; i < datas.length; i++) {
			sb.append("0x" + Integer.toHexString((int) (datas[i] & 0x000000ff)) + " ");
		}
		return sb.toString();
	}

}
