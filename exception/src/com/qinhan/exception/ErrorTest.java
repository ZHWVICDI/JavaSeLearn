package com.qinhan.exception;

public class ErrorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//利用数组长度过长  造成内存泄漏
		int[] a=new int[1024*1024*1024];
	}

}
