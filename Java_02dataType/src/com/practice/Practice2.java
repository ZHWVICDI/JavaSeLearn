package com.practice;

import java.util.Arrays;

public class Practice2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char numc='1';
		System.out.println("numc is a digit:"+Character.isDigit(numc));
		System.out.println("numc is a letter:"+Character.isLetter(numc));
		char lc='A';
		System.out.println("lc is lowercase:"+Character.isLowerCase(lc));
		System.out.println("lc is uppercase:"+Character.isUpperCase(lc));
		int x = 3,y = 3;
		System.out.println("x==y "+(x==y));
		Integer x1 = 2,y1 = 2;
		System.out.println("x1==y1 "+(x1==y1));
		Integer x2 = 222, y2 = 222;
		System.out.println("x2==y2 "+(x2==y2));
	}
}
