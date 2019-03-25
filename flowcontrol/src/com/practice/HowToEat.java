package com.practice;

import java.util.Scanner;

public class HowToEat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String day=s.next();
		switch(day) {
		case "周一":System.out.println("火锅");break;
		case "周二":System.out.println("泡面1");break;
		case "周三":System.out.println("泡面2");break;
		case "周四":System.out.println("泡面3");break;
		case "周五":System.out.println("泡4");break;
		case "周六":System.out.println("泡面5");break;
		case "周日":System.out.println("泡面6");break;
		default:System.out.println("没决定好？");
		}
	}

}
