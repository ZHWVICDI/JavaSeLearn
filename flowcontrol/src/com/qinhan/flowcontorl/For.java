package com.qinhan.flowcontorl;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for 
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
		//增强for
		int[] nums= {1,2,4,5,6};
		for(int num:nums) {
			System.out.println(num);
		}
		//do while循环
		int i=0;
		System.out.println("===\"do/while循环:\"====");
		do {
			System.out.println(i++);
		}while(i<10);
		//while 循环
		int ii=0;
		System.out.println("===\"while循环:\"====");
		while(ii<10) {
			System.out.println(ii++);
		}
	}

}
