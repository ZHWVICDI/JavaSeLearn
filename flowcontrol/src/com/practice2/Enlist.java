package com.practice2;

import java.util.Scanner;

public class Enlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请以 男 12 136 的格式输入性别、年龄、身高:====");
		Scanner sc=new Scanner(System.in);
		String sex=sc.next();
		int age=sc.nextInt();
		float height=sc.nextFloat();
		if(sex.equals("男")) {
			if((age<=26&&age>=22)&&(height>=170)) {
				System.out.println("该男性准予入伍！");
			}else {
				System.out.println("不准予入伍,某项指标不合格！");
			}
		}else if(sex.equals("女")) {
			if((age<=22&&age>=20)&&(height>=162)) {
				System.out.println("该女性准予入伍！");
			}else {
				System.out.println("不准予入伍,某项指标不合格！");
			}
		}else {
			System.out.println("输入有误！");
		}
	}

}
