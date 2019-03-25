package com.practice;

public class CountNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numStr="123928374987129843926396";
		char[] ch=numStr.toCharArray();
		Integer num=2;
		String nums=num.toString();
		int count=0;
		for(Character c : ch) {
			if(nums.equals(c.toString())) {
				count+=1;
			};
			
		}
		System.out.println(count);
		
		//第二种解法   想要实现一串数字的计数
		String nS="123928374987129843926396";
		Integer num2=123;
		String nums2=num2.toString();
		int count2=0;
		int fromIndex=0;
		int indexRange=0;
		while(fromIndex<nS.length()&&nS.indexOf(nums2, fromIndex)!=-1) {
			count2+=1;
			fromIndex=nS.indexOf(nums2, fromIndex)+1;
		}
		System.out.println(count2);
	}

}
