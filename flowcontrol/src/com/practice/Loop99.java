package com.practice;

public class Loop99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder();
		for(int i=1;i<10;i++) {
			for(int j=1;j<10;j++) {
				if(i>=j) {
					sb.append(i+"*"+j+"="+i*j+" ");
				}
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}

}
