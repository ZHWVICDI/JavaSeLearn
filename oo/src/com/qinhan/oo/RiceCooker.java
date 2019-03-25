package com.qinhan.oo;

public class RiceCooker {
	private int time;
	private int capacity;
	//赋初值的概念:一般通用的
	{
		//代码块：用于初始化某些实例变量，可以有多个，创建实例的时候自动执行
		System.out.println("代码块");
	}
	static {
		//静态代码块:类相关，类加载的时候自动执行(只会执行一次)。
		System.out.println("静态代码块");
	}
	//构造器：与类名相同，无返回值;可以有多个，参数不同
	public RiceCooker() {
		super();
		System.out.println("构造器");
	}
	
	public RiceCooker(int time) {
		super();
		this.time = time;
		System.out.println("带参构造器"+time);
	}
	//方法
	public void cook() {
		System.out.println("cooking-----");
	}
	
}
