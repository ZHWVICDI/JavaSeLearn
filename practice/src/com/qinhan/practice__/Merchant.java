package com.qinhan.practice__;

public class Merchant {

	private String name;
	// 总共制作量
	private int totalMakeCount;
	// 销售额
	private double totalAmount;

	private double totalProfit;

	private int totalCount;

	private RoastDuck[] ducks = new RoastDuck[100];
	private int currentIdx = 0;

	public Merchant(String name) {
		super();
		this.name = name;
	}

	public void make(int number) {
		for (int i = 0; i < number; i++) {
			if (currentIdx < ducks.length) {
				RoastDuck d = new RoastDuck();
				d.setPrice(20);
				d.setWeight(1);
				d.setCost(10);
				ducks[currentIdx] = d;
				currentIdx++;
				totalMakeCount++;
			} else {
				System.out.println("货架已满，不要再制作了...");
			}
		}
		System.out.println("制作完成，现有烤鸭" + currentIdx + "只");
	}

	public void sell(int number) {
		if (number > currentIdx) {
			System.out.println("我们没有这么多烤鸭了，请稍后再来买");
			return;
		}
		System.out.println("您要的" + number + "只鸭子，请您拿好，您慢走~~");

		for (int i = 0; i < number; i++) {
			RoastDuck currentDuck = ducks[currentIdx - 1];
			// 增加销售额及利润
			totalAmount += currentDuck.getPrice();
			totalProfit += currentDuck.getProfit();
			totalCount++;
			// 删除鸭子
			ducks[currentIdx - 1] = null;
			currentIdx--;
		}

	}

	public void statics() {
		double profit = totalProfit - (totalMakeCount - totalCount) * 10;
		if (profit > 0) {
			System.out.println("大家好，我是" + name + ",今天我卖了" + totalCount + "只鸭子，营业额是" + totalAmount + ",赚了" + profit
					+ "元。");
			System.out.println("成本是："+totalMakeCount*10);
			System.out.println("还有"+(totalMakeCount-totalCount)+"只烤鸭没卖出去，明天接着卖，嘿嘿嘿");
		}else {
			System.out.println("大家好，我是" + name + ",今天我卖了" + totalCount + "只鸭子，营业额是" + totalAmount + ",亏了" + profit
					+ "元。");
			System.out.println("成本是："+totalMakeCount*10);
			System.out.println("还有"+(totalMakeCount-totalCount)+"只烤鸭没卖出去，明天接着卖，哼哼哼");
		}
	}
}
