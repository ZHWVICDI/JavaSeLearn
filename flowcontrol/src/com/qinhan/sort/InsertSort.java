package com.qinhan.sort;

import java.util.Arrays;

public class InsertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//实现插入排序  n2  将无序列表插入到有序列表核心思想
		int[] src= {1,3,23,4,25,6,77,2,66,34};
		insertSort(src);
		System.out.println(Arrays.toString(src));
	}

	public static void insertSort(int arr[]){
		//一共比较 length-1轮,从1位置的数开始
		for(int i=1;i<arr.length;i++) {
			//如果当前位置的值比前面的小，那么将该值插入到前面的有序列表中
			int j;
			if(arr[i]<arr[i-1]) {
				//将当前位置的值先存入temp中，以便前面有序列表往后移动
				int temp=arr[i];
				//将比temp大的值往后面分别移一位,直到j=-1或者j=(temp大于或等于值的位置)注：j+1的位置为空
				for(j=i-1;j>=0&&temp<arr[j];j--) {
					arr[j+1]=arr[j];
				}
				//插入到j+1的位置
				arr[j+1]=temp;
			}
		}
		
	}
}
