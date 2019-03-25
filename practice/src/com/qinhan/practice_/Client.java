package com.qinhan.practice_;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractFactory a1=new ConcreteFactory1();
		AbstractFactory a2=new ConcreteFactory2();
		System.out.println("工厂1生产1系列的产品");
		a1.createProductA();
		a1.createProductB();
		System.out.println("工厂2生产2系列的产品");
		a2.createProductA();
		a2.createProductB();
		
	}

}
