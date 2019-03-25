package com.qinhan.practice;

import java.util.Arrays;

public class NonAIOS implements OSI {
	@Override
	public void bootloader() {
		// TODO Auto-generated method stub
		System.out.println("NonAIOS正在启动===");
	}

	@Override
	public void paly(String fileName,CPUI cpu,StoreDevice sd) {
		// TODO Auto-generated method stub
		byte[]	bytes=cpu.process(fileName,sd);
		byte[] song=cpu.decode(bytes);
		System.out.println("NonAIOS播放:"+new String(song));

	}

}
