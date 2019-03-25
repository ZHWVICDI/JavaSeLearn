package com.qinhan.structure.strategy;
//默认策略
public class DefaultDiscountStrategy implements DiscountStrategy {

	@Override
	public double calcPrice(double productPrice) {
		// TODO Auto-generated method stub
		System.out.println("普通会员不打折");
		return productPrice;
	}

}
