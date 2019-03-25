package com.qinhan.structure.strategy;

public class SVIPDiscountStrategy implements DiscountStrategy {

	@Override
	public double calcPrice(double productPrice) {
		// TODO Auto-generated method stub
		System.out.println("SVIP 6折");
		return productPrice*0.6;
	}

}
