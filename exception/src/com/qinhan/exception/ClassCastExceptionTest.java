package com.qinhan.exception;

public class ClassCastExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object o=new Object();
		//产生一个ClassCastException异常
		String s=(String)o;
	}

}
