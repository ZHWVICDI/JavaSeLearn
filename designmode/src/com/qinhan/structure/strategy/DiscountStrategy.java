package com.qinhan.structure.strategy;
//策略接口  -- 抽象出要进行不同策略实现的方法。
public interface DiscountStrategy {
	double calcPrice(double productPrice);
}
