package com.qinhan.practice2;

import java.util.Scanner;

public class VendingMachine {
	private Slot slot;
	private Shelf shelf;

	public VendingMachine(Slot slot, Shelf shelf) {
		super();
		this.slot = slot;
		this.shelf = shelf;
	}

	public void sell() {
		System.out.println("商品清单");
		iterateList();
		System.out.println("请输入所需要货物的名字和数量以及你投入的钱");
		Scanner sc = new Scanner(System.in);
		String itemname = sc.next();
		int num = sc.nextInt();
		double price = sc.nextDouble();
		sc.close();
		Item i = shelf.getItemByName(itemname);
		if (i.getName().equals("真心")) {
			System.out.println("对不起，这个商品你买不起");
			return;
		}
		if (i != null) {
			if (slot.getMoney(i, num, price, shelf)) {
				System.out.println(shelf.sellItem(itemname, num));
			}
		}
		System.out.println("=====================");
		System.out.println("商品清单");
		iterateList();
	}

	public void sell(String itemname, int num, double price) {
		Item i = shelf.getItemByName(itemname);
		if (i.getName().equals("真心")) {
			System.out.println("对不起，真心买不起");
			return;
		}
		if (i != null) {
			if (slot.getMoney(i, num, price, shelf)) {
				System.out.println(shelf.sellItem(itemname, num));
			}
		}
		System.out.println("现在的商品清单");
		iterateList();
	}

	public void put(Item item) {
		shelf.putItems(item);
	}

	public void iterateList() {
		shelf.iterateList();
	}

	public void count() {
		System.out.println("今天赚了" + slot.getTotalProfit());
	}
}
