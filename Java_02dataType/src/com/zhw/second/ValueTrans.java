package com.zhw.second;

public class ValueTrans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//值传递1  基本数据类型传递值
		int x1=10;
		calc1(x1);
		System.out.println(x1);
		//值传递2 传递引用  ，这里传入引用和参数引用指向的是同一个数组。
		int[] arr= {2,5,6};
		calc2(arr);
		System.out.println(arr[2]);
		//值传递3  传递引用，但是这里new 了一个新的数组，并将参数的引用指向这个新的数组。此时参数的引用和传入的引用分开，参数引用改变值和传入引用改变值无关。
		int[] x3= {2,3,5};
		calc3(x3);
		System.out.println(x3[0]);
		//值传递4  
		String str="Hello";
		calc4(str);
		System.out.println(str);
		
		//值传递思考5  这里传入string数组地址，这里通过参数引用能够更改string数组(因为指向一致)。
		String[] arrs= {"Hello","world"};
		calc5(arrs);
		System.out.println(arrs[0]);
	}
	
	private static String[] calc5(String[] s) {
		// TODO Auto-generated method stub
		s[0]+="!";
		return s;
	}



	//值传递 4  这里主要是String的不可变性。
	private static String calc4(String str) {
		// TODO Auto-generated method stub
		str+="!";
		return str;
		
	}
	private static void calc2(int[] darr) {
		// TODO Auto-generated method stub
		darr[2]=100;
	}
	private static void calc1(int x) {
		// TODO Auto-generated method stub
		x+=1;
	}
	private static void calc3(int[] x1) {
		x1=new int[3];
		x1[0]=999;
	}
}
