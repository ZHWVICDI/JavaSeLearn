package com.qinhan.practice3;

public abstract class Phone {
	protected String name;
	protected double price;
	protected double function;

	// 一般我都会加上一个默认构造方法
	public Phone() {

	}

	// 抽象类可以有构造方法
	public Phone(String name, double price) {

	}

	// 抽象类的抽象方法，规定子类一定要去做些什么实现
	protected abstract void doSome();

	public void express(String name) {
		System.out.println(name);
	}

}
