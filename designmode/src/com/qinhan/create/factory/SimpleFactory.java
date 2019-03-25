package com.qinhan.create.factory;

import com.qinhan.create.factory.entity.Audi;
import com.qinhan.create.factory.entity.Benz;
import com.qinhan.create.factory.entity.Bwm;
import com.qinhan.create.factory.entity.Car;
//演示简单工厂模式   用于返回指定的车型  
public class SimpleFactory {
	public static Car driverCar(String s) throws Exception {
		if(s.equalsIgnoreCase("Benz"))
			return new Benz();
		else if(s.equalsIgnoreCase("Bmw"))
			return new Bwm();
		else if(s.equalsIgnoreCase("Audi"))
			return new Audi();
		else
			throw new Exception();
	}
	public static void main(String[] args) throws Exception {
		SimpleFactory.driverCar("Bmw");
	}
}
