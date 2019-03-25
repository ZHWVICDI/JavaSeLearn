package com.qinhan.structure.strategy;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//策略持有者  应用 一个策略。
		PromotionManager pm=new PromotionManager(new SVIPDiscountStrategy());
		//得到结果
		System.out.println(pm.getFinalPrice(1000));
	}

}
