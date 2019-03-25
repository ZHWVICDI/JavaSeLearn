package com.qinhan.flowcontorl;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//switch case  
		//思考：为什么不设计为每一个case匹配都break掉呢？
		//思考：switch和if/else区别：switch:条件多 确定的值  if:ture/flase if可以表示一个区间
		//scanner用法   
		Scanner sc=new Scanner(System.in);
		char c=sc.next().toCharArray()[0];//哈哈，这里我们搞很复杂，char不在Scanner扫描类中，用String就可以了。
		switch(c) {
		case 'a':System.out.println("你输入的是a");break;
		case 'b':System.out.println("你输入的是b");break;
		case 'c':System.out.println("你输入的是c");break;
		case 'd':System.out.println("你输入的是d");break;
		}

	}

}
