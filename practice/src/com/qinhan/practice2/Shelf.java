package com.qinhan.practice2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Shelf {

	List<Item> items = new LinkedList<Item>();
	{
		Item item = new Item("苹果", 3, 2.3);
		Item item2 = new Item("矿泉水", 6, 3);
		Item item3 = new Item("旺仔牛奶", 4, 5);
		Item item4 = new Item("良心", 12, 0);
		items.add(item);
		items.add(item2);
		items.add(item3);
		items.add(item4);
	}

	public Item getItemByName(String itemname) {
		Iterator<Item> it = items.iterator();
		while (it.hasNext()) {
			Item item1 = it.next();
			if (item1.getName().equals(itemname)) {
				return item1;
			}
		}
		return null;
	}

	public List<Item> putItems(Item item) {
		items.add(item);
		System.out.println("将" + item.getNum() + "个" + item.getName() + "放入货架中");
		return items;
	}

	public String sellItem(String itemName, int num) {
		Iterator<Item> it = items.iterator();
		while (it.hasNext()) {
			Item item1 = it.next();
			if (item1.getName().equals(itemName) && (item1.getNum() >= num)) {
				System.out.println("出货" + item1.getName() + num + "个");
				int newItemNum = item1.getNum() - num;
				item1.setNum(newItemNum);
				return "出货成功";
			}
		}

		return "没有找到货物或货物数量过多";
	}

	public void iterateList() {
		// TODO Auto-generated method stub
		System.out.println("=========真心贩卖机=========");
		for (Item item : items) {

			System.out.println(item.getName() + " " + item.getNum() + " " + item.getPrice());

		}
	}
}
