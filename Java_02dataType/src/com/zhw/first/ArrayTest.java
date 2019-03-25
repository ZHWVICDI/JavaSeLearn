package com.zhw.first;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建一个int数组
		int numArr[]= {1,3,4,5};
		int[] numArr2= {2,4,6,8};
		
		//3种方式创建数组
		char[] charArr1= {'a','b','c','d'};//简单明了，但每个索引位置存在初始的值。
		char[] charArr2=new char[] {'a','b','c','d'};//不推荐
		char[] charArr3=new char[4];//每个索引位置不存在值，可供后面存放。这种方式要指定数组大小。
		
		//访问char数组(这里是访问整个数组)   注意：这里的char可以直接访问(进行了内置处理)，其他不能
		System.out.println(charArr1);
		//访问其他数组 例int
		System.out.println(numArr);
		//通过Arrays.toString方法访问
		System.out.println(Arrays.toString(numArr));
		//访问数组长度
		System.out.println(charArr1.length);
		
		//遍历char数组:
		//一般for循环
		for(int i=0;i<charArr2.length;i++) {
			System.out.println(charArr2[i]);
		}
		//增强for循环
		for(char ch : charArr2) {
			System.out.println(ch);
		}
		
		//遍历对象数组
		Beer[] beers= {new Beer("雪花",20),new Beer("山城",20),new Beer("青岛",20)};
		System.out.println(Arrays.toString(beers));
		//一般for循环
		for(int i=0;i<beers.length;i++) {
			System.out.println(beers[i]);
		}
		//增强for循环
		for(Beer b:beers) {
			System.out.println(b);
		}
		
		//数组排序 
		int[] numa= {12,3,90,1,2,19};
		//使用API中的Arrays类的sort方法进行排序
		//这里扩展一下Arrays的API，扩展在com.zhw.apiSeek
		Arrays.sort(numa);
		for(int x:numa) {
			System.out.println(x);
		}
	}

}
