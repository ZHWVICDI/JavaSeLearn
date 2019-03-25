package com.qinhan.structure.strategy;
//策略持有者   持有策略
public class PromotionManager {
	private DiscountStrategy discountStrategy;//策略引用
	public PromotionManager(DiscountStrategy discountStrategy) {
		this.discountStrategy=discountStrategy;
		
	}
	//应用策略
	public double getFinalPrice(double price) {
		return discountStrategy.calcPrice(price);
	}
}
