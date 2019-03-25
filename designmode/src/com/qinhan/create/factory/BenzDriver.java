package com.qinhan.create.factory;

import com.qinhan.create.factory.entity.Benz;
import com.qinhan.create.factory.entity.Car;

public class BenzDriver implements Driver {

	@Override
	public Car driveCar() {
		// TODO Auto-generated method stub
		return new Benz();
	}

}
