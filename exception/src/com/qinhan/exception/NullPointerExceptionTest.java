package com.qinhan.exception;

public class NullPointerExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String s=null;
//		String s="";
		//为空对象调用其属性和方法时 发生空指针异常。
		System.out.println(s.length());
	}

}
