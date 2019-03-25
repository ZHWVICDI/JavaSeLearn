package com.qinhan.practice;

import java.util.Scanner;

import com.sun.org.apache.bcel.internal.generic.CASTORE;

public class TryCatchPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = null;
		try {
			s=new Scanner(System.in);
			int num=s.nextInt();
			System.out.println(num);
			//throw new ClassCastException("人为创造的一个类型转换异常");
			System.out.println(19/0);
		}catch (ArithmeticException|ClassCastException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			s.close();
		}
	}

}
