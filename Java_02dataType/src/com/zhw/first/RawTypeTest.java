package com.zhw.first;

public class RawTypeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//这里定义8中基本数据类型
		byte b=127;
		short s=129;
		int i=12312312;
		long l=123123123123123L;
		float f=1.25f;
		double d=123.123d;
		
		char c= 'c';
		System.out.println(c);
		boolean b1=true;
		//运算结果为操作数中类型最大的类型
		System.out.println(2*2.5+3/2);
	}
	
	//演示基本数据类型的赋值
	public static void fuzhi() {
		//= 可以直接用数值为数值型类型赋值，但注意不要超过范围
		byte b1=127;
		//byte b2=129;//报错，超出byte表示范围
		
		//char 使用''引用单个字符赋值，或使用非负整数赋值
		char c1='a';
		char c2=12;
		//char c3='ab';//编译错误
//		char c4=12.8;//编译错误
//		char c5 = -11;//编译错误
	}
	
	//演示基本数据类型的转换
	public static void typeCast() {
		byte b=10;
		int i=b;
		long l=b;
		long ll=1000000000000L;
		//大转小
		//byte b1=ll;报错
		long lll = 10l;
		//大转小  强转 会丢失精度。
		byte b2 = (byte)lll;
		
//		byte b3 = 2000;
		short s = (byte)200000;
		System.out.println(s);
		
		float f  = 10.0f;
		byte b4 = (byte)f;
		long llll = (long)123.123;
		System.out.println(llll);
		
		long l1 = 100l;
		float f1 = l1;
		
		char c = 'A';
		int i1 = c;
		System.out.println(i1);
		char c2 = '\u0000';
		int i2 = c2;
		System.out.println(i2);
		
//		short ss = c2;
		System.out.println(100+15.0/2);
	}

}
