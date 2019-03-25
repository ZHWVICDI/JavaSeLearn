package com.qinhan.create.factory;

public class App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver d = new BenzDriver();
		Driver d2 = new BmwDriver();
		d.driveCar();
		d2.driveCar();
	}

}
