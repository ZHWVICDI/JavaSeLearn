package com.qinhan.create.AbstractFactory;

import com.qinhan.create.AbstractFactory.Products.AbstractProductA;
import com.qinhan.create.AbstractFactory.Products.AbstractProductB;
import com.qinhan.create.AbstractFactory.Products.ProductA2;
import com.qinhan.create.AbstractFactory.Products.ProductB2;
import com.qinhan.create.singleton.Singleton3;
//ConcreteProduct    实现创建具体产品对象的操作
//改进1:具体工厂使用单例   这里采用懒汉模式的单例
public class ConcreteFactory2 implements AbstractFactory {
	
	private static class SingletonHolder{
		private static final ConcreteFactory2 INSTANCE=new ConcreteFactory2();
	}
	private ConcreteFactory2() {}
	//第一次访问时加载SingletonHolder类并初始化实例
	public static final ConcreteFactory2 getInstance() {
		return SingletonHolder.INSTANCE;
	}
	
	@Override
	public AbstractProductA CreateProductA() {
		// TODO Auto-generated method stub
		return new ProductA2();
	}

	@Override
	public AbstractProductB CreateProductB() {
		// TODO Auto-generated method stub
		return new ProductB2();
	}

}
