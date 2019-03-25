package com.qinhan.exception;

public class IndexOutOfBoundsExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hel";
		int[] a=new int[3];
		//产生字符串越界异常
		//System.out.println(s.charAt(8));
		//产生数组越界异常
		System.out.println(a[6]);
	}

}
