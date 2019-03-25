package com.qinhan.practice;

public class TfStoreDevice implements StoreDevice {

	@Override
	public byte[] read(String fileName) {
		// TODO Auto-generated method stub
		System.out.println("TfStoreDevice读取文件"+fileName+"数据");
		String song="我和你,心连心，同住地球村.";
		byte[] bytes=song.getBytes();
		return bytes;
	}

}
