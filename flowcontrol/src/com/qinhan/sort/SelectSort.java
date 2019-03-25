package com.qinhan.sort;

import java.util.Arrays;

public class SelectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//实现选择排序   n2
		int[] src= {9,3,23,4,25,6,77,2,66,34};
		System.out.println("初始状态:"+Arrays.toString(src));
		//一共 轮
		for(int i=0;i<src.length;i++) {
			int minIndex=i;
			//本轮中，选出最小的数，然后将位置赋给minIndex
			System.out.println("===="+"这是第"+(i+1)+"轮"+"======");
			for(int j=i+1;j<src.length;j++) {
				if(src[minIndex]>src[j]) {
					minIndex=j;
				}
			}
			System.out.println("本轮最小的数为:"+minIndex+"位置的"+src[minIndex]);
			//在选出最小的数后交换本轮第一个和选出的最小的数的位置。
			if(minIndex>i) {
				int temp=src[minIndex];
				src[minIndex]=src[i];
				src[i]=temp;
			}
		}
		System.out.println("排序后:"+Arrays.toString(src));
		int[] a2= {12,23,4,7,2,34};
		selectSort(a2);
		System.out.println(Arrays.toString(a2));
		
	}
	public static void selectSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int minIndex=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex=j;
				}
			}
			//交换选择的最小数和当前第一个的位置的数
			if(minIndex>i) {
				int temp=arr[minIndex];
				arr[minIndex]=arr[i];
				arr[i]=temp;
			}
		}
	}
}
