package com.qinhan.create.factory;

import com.qinhan.create.factory.entity.Bwm;
import com.qinhan.create.factory.entity.Car;
//工厂方法模式
//ConcreteCreator角色    重写工厂方法以返回一个ConcreteProduct实例,这里就是Bwm对象
public class BmwDriver implements Driver {

	@Override
	public Car driveCar() {
		// TODO Auto-generated method stub
		return new Bwm();
	}

}
