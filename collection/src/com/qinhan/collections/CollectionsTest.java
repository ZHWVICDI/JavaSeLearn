package com.qinhan.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import com.qinhan.compare.HotSearch;

public class CollectionsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//collections和Collection区别
		//字段   不可变  也不知道有什么用
		List list=Collections.EMPTY_LIST;//空的列表
		Map map=Collections.EMPTY_MAP;//空的映射
		Set set=Collections.EMPTY_SET;//空的set
		
		//addAll  添加所有指定元素到Collection中
		List<String> strlist=new LinkedList<String>();
		String[] strs= {"hello","world","!"};
		Collections.addAll(strlist, strs);
		System.out.println("addAll:"+strlist);
		
		//asLifoQueue 先进后出方式形式返回
		/*
		 * Queue<String> queue=Collections.asLifoQueue(strlist); System.out.println();
		 */
		
		//binarySearch  List  二分查找在列表中的 值， 返回索引
		List<Integer> hotlist=new ArrayList<Integer>();
		Integer[] nums= {1,23,4,534,5,43,55,66,73,34,23,43,5,2};
		Collections.addAll(hotlist, nums);
		int index=Collections.binarySearch(hotlist, 43);
		System.out.println(index);
		
		//checked{Collection}{Map}{SortedMap}{List}{Set}{SortedSet}  返回指定集合类的动态类型安全视图
		  
		//copy  List    用list1的所有元素赋给list2   注意：只有list2现有那么多元素才能赋值
		List<Integer> list1=new LinkedList<Integer>();
		Integer[] nums2= {21,23,42,52};
		Collections.addAll(list1, nums2);
		List<Integer> list2=new ArrayList<Integer>();
		Integer[] nums3= {234,234,556,322};
		Collections.addAll(list2, nums3);
		Collections.copy(list2, list1);
		System.out.println("Collections.copy得到的数组:"+list2);
		
		//emptyList/emptyMap/emptySet  返回空的列表、映射、set
		
		//fill List   使用指定元素替换指定列表中的所有元素   注意：只有filllist的元素都替换为指定元素
		List<Integer> filllist=new ArrayList<Integer>();
		Integer[] nums4= {234,234,556,322};
		Collections.addAll(filllist, nums4);
		Collections.fill(filllist, 23);
		System.out.println("fill:"+filllist);
		//frequency  C 返回集合里面指定元素的个数
		System.out.println("指定元素个数frequency:"+Collections.frequency(filllist, 23));
		//indexOfSubList/lastIndexOfSubList   List  返回子列表在列表中的第一次或最后一次出现的位置，没有返回-1
		List<Integer> indexList=new ArrayList<Integer>();
		indexList.add(23);
		System.out.println("indexOfSublist:"+Collections.indexOfSubList(filllist,indexList));
		System.out.println("lastIndexOfSublist:"+Collections.lastIndexOfSubList(filllist,indexList));
		
		//max/min    C  返回集合中的最小最大元素，提供一个外部排序器的参数。
		System.out.println("min方法"+Collections.max(filllist));
		
		//nCopies
		//newSetFromMap
		//replaceAll
		//reverse
		//reverseOrder
		//rotate
		//shuffle
		//singletoin  {Map}{List}
		//sort
		//swap
		//synchronized{Collection}{List}{Map}{SortedMap}{Set}{SortedSet}
		//unmodifiable{Collection}{List}{Map}{SortedMap}{Set}{SortedSet}
		
		//最喜欢的api大概是binarySearch、addAll、max/min的方法
		//binarySearch  可以让我们在list中通过二分查找到相应元素的索引位置
		//addAll   在给列表填充值的时候 非常的方便
		//max/min  可以快速的查找到集合中的最大最小值，其重载的方法还可以提供一个外部排序器让我们自定义顺序
	}

}
