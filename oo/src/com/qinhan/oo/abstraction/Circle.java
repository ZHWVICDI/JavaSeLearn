package com.qinhan.oo.abstraction;
//具体类 实现自己的行为
public class Circle extends Shape {
	private double r;

	public Circle() {
		super();
	}
	
	public Circle(double r) {
		this.r=r;
	}
	
	@Override
	public double calcArea() {
		// TODO Auto-generated method stub
		return Math.PI * r * r;
	}

}
