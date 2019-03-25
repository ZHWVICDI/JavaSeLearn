package com.practice;

public class IsPalinDromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="蜜蜂酿蜂蜜";
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		String s2=new String(sb);
		if(s.equals(s2)) {
			System.out.println("此字符串为回文字符串！");
		}
		
	}

}
