package com.qinhan.practice2;

public class Person {
	public static String name="person";
	public String height="person is 170";
	public Person() {
		super();
		System.out.println("我是Person类,");
		System.out.println("我的父类是Object!");
		System.out.println("我的子类为Employee类和Student类");
		System.out.println("==============================");
		System.out.println("============下一个为子类   =============");
		System.out.println();
		// TODO Auto-generated constructor stub
	}
	public static void sayName() {
		System.out.println(name);
		
	}
	public void sayHeight() {
		System.out.println("父类的属性height"+height);
	}
	
}
