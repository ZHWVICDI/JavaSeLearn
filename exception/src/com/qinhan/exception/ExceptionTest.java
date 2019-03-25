package com.qinhan.exception;

import java.io.File;
import java.io.FileReader;

public class ExceptionTest {
//演示异常的发生
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("演示异常发生情况");
		//1.除数为0的异常    这里并没有处理这个异常
		//2.除数为0，会有数学异常，但是数学异常是运行时异常，所以编译器不会报错
		System.out.println(100/0);
		System.out.println("如果我被打印，则表示异常被处理");
		
		//文件未找到异常，是运行时异常，编译器检测，不处理就会报错。
//		FileReader fr =new FileReader(new File("a.txt"));
		
	}

}
