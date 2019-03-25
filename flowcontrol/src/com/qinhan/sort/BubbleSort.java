package com.qinhan.sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//实现冒泡排序   n2
		int[] src= {1,3,23,4,25,6,77,2,66,34};
		//一共循环长度-1轮
		System.out.println("初始状态:"+Arrays.toString(src));
		for(int i=0;i<src.length-1;i++) {
			//每轮循环次数
			int[] tempsrc=Arrays.copyOf(src, src.length);
			System.out.println("======"+"第"+(i+1)+"轮"+"======");
			for(int j=0;j<src.length-i-1;j++) {
				//如果前面比后面大，就互换
				if(src[j]>src[j+1]) {
					System.out.println("互换"+(src[j])+"和"+(src[j+1]));
					System.out.println(Arrays.toString(src));
					int tep=src[j+1];
					src[j+1]=src[j];
					src[j]=tep;
				}
			}

			if(Arrays.equals(tempsrc, src)) {
				System.out.println("本轮未互换");
			}
		}
		
			System.out.println("排序后:"+Arrays.toString(src));
			int[] a2= {12,23,4,7,2,34};
			bubbleSort(a2);
			System.out.println(Arrays.toString(a2));
	}
	
	public static void bubbleSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {//这里的i结束条件应该为到长度-1-i
				if(arr[j]>arr[j+1]) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
	}
}