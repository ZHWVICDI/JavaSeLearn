package com.qinhan.create.AbstractFactory;

import com.qinhan.create.AbstractFactory.Products.AbstractProductA;
import com.qinhan.create.AbstractFactory.Products.AbstractProductB;
import com.qinhan.create.AbstractFactory.Products.ProductA1;
import com.qinhan.create.AbstractFactory.Products.ProductB1;
//ConcreteProduct    实现创建具体产品对象的操作 
//改进1:具体工厂作为单例  因为一般每个产品系列只需一个具体工厂的实例 这里采用饿汉模式的单例
//改进2： 为每一个产品定义一个工厂方法     注意： 我的理解这里已经实现了工厂方法了。
//改进3： 定义一个可扩展的工厂，这里还没有理解透彻。
public class ConcreteFactory1 implements AbstractFactory {
	private static ConcreteFactory1 instance=new ConcreteFactory1();
	
	private ConcreteFactory1(){
		
	}
	
	public static ConcreteFactory1 getInstance() {
		return instance;
	}
	
	@Override
	public AbstractProductA CreateProductA() {
		// TODO Auto-generated method stub
		return new ProductA1();
	}

	@Override
	public AbstractProductB CreateProductB() {
		// TODO Auto-generated method stub
		return new ProductB1();
	}

}
