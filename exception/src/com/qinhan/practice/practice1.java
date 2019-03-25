package com.qinhan.practice;

public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 因为运行时异常编译期不会检测，没有处理的话运行时程序会中断，所以先trycatchfinally，再
		try {
			System.out.println(199 / 0);
		} catch (ArithmeticException e) {
			System.out.println("我捕获到数学异常，并且say出来");
		} finally {
			System.out.println("我finally块无论如何都想要表现一下，我也say");
		}
		
		try {
			String s=null;
			s.length();
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("我捕获到空指针异常");
		}
		try {
			String s="helo123";
			Integer.parseInt(s);
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("我捕获到数字格式异常");
		}
		try {
			int[] a = {1,2,3,4};
			System.out.println(a[6]);
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("我捕获到索引越界异常");
		}
		try {
			Object o=new Object();
			String s=(String)o;
		} catch (ClassCastException e) {
			// TODO: handle exception
			System.out.println("我捕获到类型转换异常");
		}

	}

}
