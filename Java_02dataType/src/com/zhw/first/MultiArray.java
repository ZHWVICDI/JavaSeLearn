package com.zhw.first;

import java.util.Arrays;

public class MultiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//声明创建一个多维数组
		int[][] multiA= {{1,2,3},{4,5,6},{7,8,9}};
		int[][] multiA2= new int[][]{{1,2,3},{4,5,6},{7,8,9}};//这里不能指定数组大小
		int[][] multiA3=new int[3][];//这里低维必须指定大小，高维可不指定
		
		//访问多维数组
		int[] arr1=multiA[0];
		int[] arr2=multiA[1];
		int[] arr3=multiA[2];
		//使用Arrays的toString访问一维数组，这个方法不能用于二维数组
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		//使用Arrays的deepToString方法访问呢
		System.out.println(Arrays.deepToString(multiA));
		//一般for循环访问多维数组
		for(int i=0;i<multiA.length;i++) {
			for(int j=0;j<multiA[i].length;j++) {
				System.out.println(multiA[i][j]);
			}
		}
		//增强for循环访问多维数组
		for(int[] A:multiA) {
			for(int j:A) {
				System.out.println(j);
			}
		}
		
		
	}

}
