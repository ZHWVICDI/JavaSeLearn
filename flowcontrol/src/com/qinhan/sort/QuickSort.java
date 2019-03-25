package com.qinhan.sort;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//实现快速排序
		int[] a= {23,4,5,34,2,8,64,6,34};
		quickSort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	}
	//实现递归方法
	public static void quickSort(int[] arr,int low ,int high) {
		//起始位置
		int start =low;
		//结束位置
		int end=high;
		//基准，key
		int key=arr[low];
		System.out.println("->分区为:"+low+"到"+high+"开始快速排序:"+Arrays.toString(arr));
		while(end>start) {
			//从后往前，如果遇到大于key的值，则end往前挪 
			while(end>start&&arr[end]>key) {
				end--;
			}
			//然后判断，将小于key的值与start位置的值交换
			if(arr[end]<=key) {
				int tmp=arr[end];
				arr[end]=arr[start];
				arr[start]=tmp;
			}
			//从前往后挪，遇到小于key的值，则start往后挪
			while(end>start&&arr[start]<=key) {
				start++;
			}
			if(arr[start]>key) {
				int tmp=arr[start];
				arr[start]=arr[end];
				arr[end]=tmp;
			}
		}
		System.out.println("->分区为:"+low+"到"+high+"快速排序后:"+Arrays.toString(arr));
		System.out.println("=======================================================");
		if((start-1)>low){
			quickSort(arr,low,start-1);
			
		}
		if(high>(end+1)) {
			quickSort(arr,end+1,high);
		}
	}
}
