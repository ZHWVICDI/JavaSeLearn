package com.qinhan.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ArrayListApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//构造一个ArrayList 初始容量为10
		List<String> strList=new ArrayList<String>();
		//指定初始容量为100
		List<String> strList2=new ArrayList<String>(100);
		Map<String,String> map=new HashMap<String,String>();
		//增
			//add 
		strList.add("hello");//末尾添加元素
		strList.add("");
		strList.add("world");//向指定位置添加元素
		System.out.println(strList);
		
		List<String> lineString=new LinkedList<>();
		lineString.add("爱是恒久远");
		//允许null存在并可多个
		lineString.add(null);
		lineString.add(null);
		System.out.println(lineString);
		
	}

}
