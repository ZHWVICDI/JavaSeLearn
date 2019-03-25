package com.qinhan.oo.instanition;

public class Parent {
	private int height;

	private Monitor monitor = new Monitor("父类");

	static {
		System.out.println("父类静态代码块");
	}

	{
		System.out.println("父类代码块");
	}

	// 构造器：用来构造实例
	public Parent() {
		System.out.println("a 无参父类构造器");
	}

	public Parent(int height) {
		System.out.println("b  一个参数的父类构造器");
	}

	public Parent(int height, Monitor monitor) {
		this(height);
		System.out.println("c 两个参数的父类构造器");
	}

}
