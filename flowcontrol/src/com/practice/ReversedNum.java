package com.practice;

public class ReversedNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//解法一
		Integer num=12345;
		String nums=num.toString();
		char[] chars=nums.toCharArray();
		System.out.println(chars.length);
		
		StringBuilder sb=new StringBuilder();
		sb.append(chars);
		sb.reverse();
		String reversedS=sb.toString();
		int reversedInt=Integer.valueOf(reversedS);
		System.out.println(reversedInt);
		
		//解法二
		
	}

}
