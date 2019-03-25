package com.qinhan.practice;

import java.util.HashMap;
import java.util.Map;

public class EmulatorMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//模拟活动及对应的投票数
		Map<String,Integer> choices=new HashMap<>();
		choices.put("郊游", 12);
		choices.put("聚餐", 2);
		choices.put("游戏", 12);
		System.out.println(choices);
		//模拟工号和对应的职工名字
		Map<Long,String> workers=new HashMap<>();
		workers.put(0001L, "张瀚文");
		workers.put(0002L, "马云");
		workers.put(0003L, "马化腾");
		System.out.println(workers);
	}

}
