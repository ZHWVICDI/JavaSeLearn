package com.practice2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=10;i<=105;i++) {
			if(isPrimeNumber(i)) {
				System.out.println(i+"为素数！");
			}
		}
	}

	private static boolean isPrimeNumber(int num) {
		// TODO Auto-generated method stub
		boolean b=true;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	private static boolean isPrimeNumber2(int num) {
		// TODO Auto-generated method stub
		boolean b=true;
		int c=(int)Math.sqrt(num);
		for(int i=2;i<=c;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

}
