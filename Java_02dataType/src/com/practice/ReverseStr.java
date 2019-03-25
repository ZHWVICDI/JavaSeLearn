package com.practice;

public class ReverseStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//解法一
		StringBuilder sb=new StringBuilder();
		sb.append("zhwviddi");
		sb.reverse();
		System.out.println(sb);
		//解法二
		String s=new String("zhwvic");
		char[] chars=s.toCharArray();
		char[] reversed=new char[chars.length];
		for(int i=0;i<chars.length;i++) {
			reversed[chars.length-i-1]=chars[i];
		}
		String reversedStr=new String(reversed);
		System.out.println(reversedStr);
	}

}
