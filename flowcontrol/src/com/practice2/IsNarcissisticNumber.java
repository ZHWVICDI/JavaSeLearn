package com.practice2;

public class IsNarcissisticNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  for(int i=100;i<=500;i++) {
			  if(isNarcissisticNumber(i)) {
				  System.out.println(i+"为水仙花数！"); 
			  } 
		  }
		 
	}

	private static boolean isNarcissisticNumber(Integer number) {
		// TODO Auto-generated method stub
		int digit=number.toString().toCharArray().length;
		int sum=0;
		//将每个位的数乘以digit，然后加起来
		//temp用来做为临时处理的number
		int temp=number;
		while(temp!=0) {
			int d=temp%10;
			sum+=Math.pow(d, digit);
			temp/=10;
		}
		return number.equals(sum);
	}

}
