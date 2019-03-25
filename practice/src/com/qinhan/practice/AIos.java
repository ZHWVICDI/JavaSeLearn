package com.qinhan.practice;

import java.util.Arrays;

public class AIos implements OSI {
private CPUI cpu=new CommonCPU();
	@Override
	public void bootloader() {
		// TODO Auto-generated method stub
		System.out.println("AIOS正在启动===");
	}

	@Override
	public void paly(String fileName,CPUI cpu,StoreDevice sd) {
		// TODO Auto-generated method stub
		byte[]	bytes=cpu.process(fileName,sd);
		byte[] song=cpu.decode(bytes);
		System.out.println("AIOS播放:"+new String(song));
		
	}

}
