package com.common.platform.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class Mp3FileUtil {
	private int readPos;

	private int fileSize;

	private FileInputStream fis;

	private String filePath;

	private static class LazyHolder {
		private static final Mp3FileUtil INSTANCE = new Mp3FileUtil();
	}

	public static Mp3FileUtil getInstance() {
		return LazyHolder.INSTANCE;
	}
	
	public void initStream(String filePath) throws Exception {
		this.filePath=filePath;
		File file = new File(filePath);
		fis = new FileInputStream(file);
		fileSize = fis.available();
	}

	/***
	 * 
	 * @return
	 * @throws Exception
	 */
	public byte[] readFile(int count) throws Exception {
		int read = 0;
		if (fis != null) {
			byte buffer[] = new byte[count];
			read = fis.read(buffer);
			if (read == -1) {
				// 此时已经说明读取完成，不需要再次进行发送数据，
				closeFile();
			} else {
				readPos += read;
				System.out.println("已经读取---" + readPos + "--个字节");
			}
			if (read == -1) {
				return null;
			}
			return buffer;

		}
		return null;
	}

	public void closeFile() throws IOException {
		if (fis != null) {
			fis.close();

		}
	}
}
