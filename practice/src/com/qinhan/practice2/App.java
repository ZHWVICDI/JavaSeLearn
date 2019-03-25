package com.qinhan.practice2;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {

		Shelf shelf = new Shelf();
		VendingMachine vd = new VendingMachine(new Slot(), shelf);
		Item item = new Item("火腿", 4, 23);
		Item item2 = new Item("真心", 1, Integer.MAX_VALUE);
		vd.put(item);
		vd.put(item2); // 人就免了
		vd.iterateList();
		vd.sell("苹果",2,5);
		vd.sell("矿泉水",1,3.0);
		vd.sell("矿泉水",12,3);
		vd.count();

	}
}
