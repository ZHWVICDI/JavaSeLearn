package com.qinhan.practice2;

public class Slot {
	private double totalProfit;

	public boolean getMoney(Item item, int num,double putprice, Shelf shelf) {
		double totalprice=num*item.getPrice();
		if (totalprice <= putprice) {
			totalProfit += totalprice;
			System.out.println("付款成功并返回您"+(putprice-totalprice));
			return true;
		}else {
			System.out.println("退回"+putprice); 
			return false;
		}
	}

	public double getTotalProfit() {
		return totalProfit;
	}

	public void setTotalProfit(double totalProfit) {
		this.totalProfit = totalProfit;
	}
}
