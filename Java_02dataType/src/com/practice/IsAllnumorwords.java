package com.practice;

public class IsAllnumorwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ahzw13";
		if(s.matches("^[A-Za-z0-9]+$")) {
			System.out.println("全英文或数字");
		}
	}

}
