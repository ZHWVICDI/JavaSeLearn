package com.qinhan.oo.abstraction;

//一个抽象类 shape
public abstract class Shape {
	protected int x = 10;

	// 抽象类可以有构造器
	public Shape() {

	}

	// 抽象方法 让子类去实现
	public abstract double calcArea();
}
