package com.zhw.first;
//演示javaString类型的常量池
public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//= 直接赋值的字符串,Java使用字符串常量池来存储 ，且相同的共用一个字符串
		String s2="Hello";
		String s3="Hello";
		//使用new创建，则每次都开辟一个新的内存空间
		String s4=new String("Hello");
		String s5=new String("Hello");
		//验证结论
		System.out.println("s2==s3:"+(s2==s3));
		System.out.println("s4==s5:"+(s4==s5));
		System.out.println("s2==s4:"+(s2==s4));
	}

}
