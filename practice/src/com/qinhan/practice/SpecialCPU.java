package com.qinhan.practice;
//专用CPU
public class SpecialCPU implements CPUI {
	@Override
	public byte[] process(String fileName,StoreDevice sd) {
		// TODO Auto-generated method stub
		// 使用存储器读取文件//然后处理文件
		byte[] bytes = sd.read(fileName);
		System.out.println("SpecialCPU处理:" + fileName);
		// 处理操作
		return bytes;
	}
	@Override
	public byte[] decode(byte[] bytes) {
		// TODO Auto-generated method stub
		System.out.println("SpecialCPU解析音乐文件");
		return null;
	}

}
