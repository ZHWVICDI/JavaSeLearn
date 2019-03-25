package com.qinhan.create.AbstractFactory;

public class App {
//Client   这里应该仅使用AbstractProduct和AbstractProduct类声明的接口
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//协作：通常在运行时刻创建一个ConcreteFactory类的实例。这一具体工厂创建具有特定实现的产品对象。
		//为创建不同的产品对象，客户应使用不同的具体工厂。
		
		//这里我们创建1工厂，生产1的产品===可以理解为1系列的产品
		AbstractFactory ab=ConcreteFactory1.getInstance();
		ab.CreateProductA();
		ab.CreateProductB();
		//这里我们创建2工厂，生产2的产品===可以理解为2系列的产品
		AbstractFactory ab2=ConcreteFactory2.getInstance();
		ab2.CreateProductA();
		ab2.CreateProductB();
	}	
	

}
