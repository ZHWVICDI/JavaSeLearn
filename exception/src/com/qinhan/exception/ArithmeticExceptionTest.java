package com.qinhan.exception;

public class ArithmeticExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//浮点数除以0	不会发生ArithmeticException
		System.out.println(10.0/0);
		//整数除以0		发生数学异常
		System.out.println(10/0);
	}

}
