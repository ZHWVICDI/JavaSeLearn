package com.qinhan.create.AbstractFactory;

import com.qinhan.create.AbstractFactory.Products.AbstractProductA;
import com.qinhan.create.AbstractFactory.Products.AbstractProductB;

//AbstractFactory :声明创建抽象产品对象的操作接口
public interface AbstractFactory {
	public AbstractProductA CreateProductA();
	public AbstractProductB CreateProductB();
}
