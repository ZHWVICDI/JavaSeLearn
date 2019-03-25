package com.qinhan.oo.instanition;

public class Child extends Parent {
	private Monitor monitor = new Monitor("子类");
	// 重量
	private int weight;
	static {
		System.out.println("子类静态代码块");
	}
	{
		System.out.println("子类代码块");
	}

	public Child() {
		super(123);
		System.out.println("1  无参子类构造器");
	}

	public Child(int weight) {
		this();
		this.weight = weight; // 一些很复杂的初始化操作
		System.out.println("2  一个参数的子类构造器");
	}

	// 这里演示this的用法
	public Child(Monitor monitor, int weight) {
		this(weight);
		System.out.println("3  两个参数的子类构造器");
		this.monitor = monitor;
		this.weight = weight;
	}

}
