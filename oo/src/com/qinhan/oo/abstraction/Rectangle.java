package com.qinhan.oo.abstraction;

public class Rectangle extends Shape {
	private double length;
	private double width;

	public Rectangle() {
	}

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public double calcArea() {
		return length * width;
	}

}
