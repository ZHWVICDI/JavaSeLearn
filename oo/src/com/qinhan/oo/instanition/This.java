package com.qinhan.oo.instanition;

//探究this的用法
public class This extends Super {
	private String name;

	public This(String name) {
		// 用法一:用来调用构造方法
		this();
		// 用法二:表示自身对象引用
		this.name = name;
	}

	public This() {
		// 用法一：用来调用父类构造方法
		super();
		// this可以被打印
		System.out.println(this);
		// super不能被打印
		// System.out.println(super);
	}

	public String doSth() {
		return null;
	}

	public String doSth2() {
		return null;
	}
}
