package com.qinhan.compare;

import java.util.Comparator;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<HotSearch> hotsearch=new TreeSet<HotSearch>();
		//我们对HotSearch实现了Comparable接口
		hotsearch.add(new HotSearch("zhw",111));
		hotsearch.add(new HotSearch("tt",234));
		hotsearch.add(new HotSearch("tyq",123));
		System.out.println(hotsearch);
		
		//思考comparable接口和comparator接口的区别  都是提供一个比较逻辑
		//comparator 为一个外部比较器， 一般用来封装算法
		//如果排序比较单一，那么就在对象内部实现comparable接口。如果要多种多样的排序，那么我们就使用外部比较器来实现。
		Comparator<HotSearch2> comparator=new Comparator<HotSearch2>() {
			@Override
			public int compare(HotSearch2 o1, HotSearch2 o2) {
				if(o1.getPopularity()==o2.getPopularity()) {
					return 0;
				}
				return o1.getPopularity()>o2.getPopularity() ? 1:-1;
			}	
		};
		//使用Comparator  这里作为构建TreeSet的参数
		TreeSet<HotSearch2> hot2=new TreeSet<HotSearch2>(comparator);
		hot2.add(new HotSearch2("zhw",111));
		hot2.add(new HotSearch2("tt",234));
		hot2.add(new HotSearch2("tyq",123));
		System.out.println(hot2);
		
	}

}
