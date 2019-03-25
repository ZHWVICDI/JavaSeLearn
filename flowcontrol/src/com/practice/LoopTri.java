package com.practice;

public class LoopTri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder();
		for(int i=1;i<10;i++) {
			for(int j=1;j<10;j++) {
				if(i<=j)
					sb.append("*");
				else
					sb.append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
		
		//查找规律，第一行1个*的话，第二行3个  5  7 .即2*i-1个*;
		for(int i=1;i<=7;i++){
			//打印左边的空白，这里的6 取值应该适当，否则到下面空格不够
			 for(int j=6-i;j>=0;j--){
			       System.out.print(" ");
			 }
			 for(int k=1;k<=2*i-1;k++){
			       System.out.print("*");
			 }
			 System.out.println();
		}

	}

}
