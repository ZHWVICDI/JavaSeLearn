package com.qinhan.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {
	
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
		map.put("h", "hw");
		map.put("h", "zh");
		String str=map.get("h");
		System.out.println(str);
		//得出结论 重复放会覆盖  map是一对一关系 键不可重复，值不可重复
		Map<String,Integer> choices=new HashMap<>();
		choices.put("郊游", 12);
		choices.put("聚餐", 2);
		choices.put("游戏", 12);
		
		//get
		System.out.println("get:"+choices.get("游戏"));
		//remove
		choices.remove("游戏");
		System.out.println("remove:"+choices);
		//size
		System.out.println("size:"+choices.size());
		
		//遍历value key entryset(映射关系的条目)
		Set<String> keys=choices.keySet();
		keys.forEach(x->System.out.print(" "+x));
		System.out.println();
		
		Collection<Integer> values=choices.values();
		values.forEach(x->System.out.print(" "+x));
		System.out.println();
		
		Set<Entry<String,Integer>> entries= choices.entrySet();
		entries.forEach(x->System.out.print(" "+"key:"+x.getKey()+"value:"+x.getValue()));
		
		
		
	}
}
