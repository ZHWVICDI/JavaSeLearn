package com.qinhan.structure.strategy;

public class VIPDiscountStrategy implements DiscountStrategy {

	@Override
	public double calcPrice(double productPrice) {
		// TODO Auto-generated method stub
		System.out.println("VIP 8折");
		return productPrice*0.8;
	}

}
