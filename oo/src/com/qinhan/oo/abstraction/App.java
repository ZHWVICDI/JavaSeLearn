package com.qinhan.oo.abstraction;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape c=new Circle(10);
		Shape r=new Rectangle(10,34);
		System.out.println(c.calcArea());
		System.out.println(r.calcArea());
	}

}
