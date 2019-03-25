package com.qinhan.create.factory;

import com.qinhan.create.factory.entity.Car;
//工厂方法模式	 
//Creator角色：用于声明工厂方法，该方法返回Product类型的对象，这里是Car
public interface Driver {
	public Car driveCar();
}
