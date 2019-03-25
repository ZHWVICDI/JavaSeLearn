package com.qinhan.practice;

public class InStoreDevice implements StoreDevice {

	@Override
	public byte[] read(String fileName) {
		// TODO Auto-generated method stub
		System.out.println("内置存储器读取文件"+fileName+"数据");
		String song="两只老虎，两只老虎，跑得快";
		byte[] bytes=song.getBytes();
		return bytes;
	}

}
