package com.qinhan.exception;

public class NumberFormatExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="123k";
		//产生一个数字格式异常
		System.out.println(Integer.parseInt(s));
	}

}
