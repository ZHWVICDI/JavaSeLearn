package com.qinhan.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListTest {
	public static void main(String[] args) {
		List<Integer> numL = new ArrayList<Integer>();
		List<Integer> beAddedNumL = new ArrayList<Integer>();
		beAddedNumL.add(1);
		beAddedNumL.add(11);
		beAddedNumL.add(12);
		beAddedNumL.add(21);
		beAddedNumL.add(123);
		numL.add(12);
		// 会报运行时异常，因为其本质上还是一个数组。
		numL.add(1, 23);
		numL.addAll(1, beAddedNumL);// 在指定位置插入一个列表
		numL.forEach(x -> {
			System.out.println(x);
		});

		int num = numL.get(2);// 得到列表指定位置的元素
		System.out.println("num:" + num);

		int indexof = numL.indexOf(12);// 返回指定元素的第一次出现位置。
		System.out.println("indexof:" + indexof);// 没有返回-1
		int lastIndexOf = numL.lastIndexOf(12);// 返回指定元素的最后一次出现位置
		System.out.println("lastIndexOf:" + lastIndexOf);

		int numBeRemoved = numL.remove(lastIndexOf);// 移除索引位置的元素并返回该元素
		System.out.println("被remove的数据:" + numBeRemoved);

		System.out.println("原列表:" + numL);
		numL.set(2, 12);// 将索引位置的元素更改为指定的元素。
		System.out.println("numL的set:" + numL);

		System.out.println("列表的大小size:" + numL.size());

		System.out.println("iterator元素：");
		Iterator<Integer> it = numL.iterator();
		while (it.hasNext()) {
			int i=it.next();
			System.out.print(" " + i);	
		}
		System.out.println("");
		
		List<Integer> subNumList=numL.subList(2,5);
		System.out.println("subList:"+subNumList);//获得子列表 通过索引
		
		numL.clear();//清除列表中所有元素
		numL.forEach(x -> {
			System.out.println(x);
		});
		
		LinkedList<String> stringList=new LinkedList<String>();
		//addFirst/addLast
		stringList.addFirst("开头1");
		stringList.addLast("末尾1");
		stringList.addFirst("开头2");
		stringList.addLast("末尾2");
		//offer/offerFirst/offerLast
		//peek/peekFirst/peekLast  获取但不移除
		//poll/pollFirst/pollLast  获取并且移除
		//pop/push      压栈/入栈
		//remove/removeFirst/removeFirstOccurrence/removeLast/removeLastOcurrence
		System.out.println("原linkedlist:"+stringList);
		//descendingIterator   逆向迭代
		System.out.println("逆向迭代:");
		Iterator<String> reserveit=stringList.descendingIterator();
		while(reserveit.hasNext()) {
			String strelement=reserveit.next();
			System.out.print(" "+strelement);
		}
		System.out.println();
		//element 获取第一个元素，但不移除
		System.out.println("第一个元素:"+stringList.element());
		System.out.println(stringList);
		//getFirst/getLast
		System.out.println("getFirst:"+stringList.getFirst());
		System.out.println("getLast:"+stringList.getLast());
		//listIterator
		System.out.println("从指定位置开始迭代:(这里假设为1)");
		ListIterator<String> listit=stringList.listIterator(1);
		while(listit.hasNext()) {
			String nowS=listit.next();
			System.out.print(nowS+" ");
		}
		System.out.println();
		
		
	}
}
