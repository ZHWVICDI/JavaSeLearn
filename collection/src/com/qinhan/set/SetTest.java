package com.qinhan.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();
		// add
		set.add("钻石恒久远");
		set.add("一颗永流传");
		set.add(null);
		set.add(null);
		// 只有一个null
		System.out.println(set);
		// remove
		System.out.println("set被remove:" + set.remove(null));
		// removeall
		// contains
		System.out.println("contains与否:" + set.contains(null));

		System.out.println("iterator Set的元素:");
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String i = it.next();
			System.out.println(i);
		}

		// 有序的set集合
		TreeSet<Integer> set2 = new TreeSet<Integer>();
		set2.add(1);
		// 不支持null，会报NullPointerException异常
		// set2.add(null);
		set2.add(3);
		set2.add(2);
		set2.add(7);
		set2.add(9);
		set2.add(8);
		System.out.println(set2);
		// ceiling 向上转型后，编译器只能使用父类的方法。
		System.out.println("ceiling:" + set2.ceiling(5));// 这个方法利用的是二叉树查找，找大于该元素的最小元素。
		System.out.println("floor:" + set2.floor(5));// 同理，找小于该元素的最大元素
		
		// first/last
		System.out.println("first:" + set2.first());//同上，不过是严格意义上的大于，我的理解是针对整个Tree二叉红黑树而言的。
		System.out.println("last:" + set2.last());
		
		// pollFirst/pollLast
		System.out.println("原TreeSet为：" + set2);
		set2.pollFirst();
		System.out.println("pollFirst:" + set2);
		set2.pollLast();
		System.out.println("pollLast:" + set2);

	}

}
