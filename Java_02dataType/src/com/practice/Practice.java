package com.practice;

import java.util.Arrays;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data= {11,23,32,999,10};
		int[] data2= {11,23,32,999,10};
		
		//计算data的和
		int sum=0;
		for(int d:data) {
			sum+=d;
		}
		System.out.println("和为："+sum);
		
		//生成一个倒序的数组
		int[] reversed=new int[data.length];
		for(int i=0;i<data.length;i++) {
			reversed[data.length-i-1]=data[i];
		}
		System.out.println(Arrays.toString(reversed));
	}

}
