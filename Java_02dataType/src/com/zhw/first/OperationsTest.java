package com.zhw.first;

public class OperationsTest {
	public static void main(String[] args) {
		int a = 10;
		int b = 15;
		int c = 120;
		//算术运算符
		System.out.println("b-a => "+(b-a));
		System.out.println("b+a => "+(b+a));
		System.out.println("b*a => "+(b*a));
		System.out.println("b/a => "+(b/a));
		System.out.println("b%a => "+(b%a));
		
		float f1 = 12f;
		float f2 = 4.0f;
		System.out.println(f1*f2);
		System.out.println(f1/f2);
		
		
		//关系运算符
		int x =100;
		int y=120;
		System.out.println("x>y =>"+(x>y));
		System.out.println("x>=y =>"+(x>=y));
		System.out.println("x==y =>"+(x==y));
		System.out.println("x<=y =>"+(x<=y));
		System.out.println("x<y =>"+(x<y));
		System.out.println("x!=y =>"+(x!=y));
		
		//自加自减
		x = x + 1;
		x++;//<=> x=x+1;
		System.out.println(x);
		++x;//<=> x=x+1;
		System.out.println(x);
		System.out.println("===========");
		//y=120 ; y++(���ؼ�֮ǰ��ֵ) y=121; ++y(���ؼ�֮���ֵ�� y=122;
		System.out.println(y++);
		System.out.println(++y);
		System.out.println(y);
		int z = 100;
		
		x+=5;//x= x+5;
		
		if((z++)>99 | (z++)<100) {
			System.out.println(z+1);
		}else {
			System.out.println(z+2);
		}
		
		//逻辑运算符
		//& && | || ! ^(���)
		
		System.out.println("true && true ="+(true && true));
		System.out.println("true && false ="+(true && false));
		System.out.println("false && true ="+(false && true));
		System.out.println("false && false ="+(false && false));
		
		System.out.println("true || true ="+(true || true));
		System.out.println("true || false ="+(true || false));
		System.out.println("false || true ="+(false || true));
		System.out.println("false || false ="+(false || false));

		System.out.println("true ^ true ="+(true ^ true));
		System.out.println("true ^ false ="+(true ^ false));
		System.out.println("false ^ true ="+(false ^ true));
		System.out.println("false ^ false ="+(false ^ false));
		
		
		System.out.println("true & true ="+(true & true));
		System.out.println("true & false ="+(true & false));
		System.out.println("false & true ="+(false & true));
		System.out.println("false & false ="+(false & false));
		
		int x1 = 100;
		int y1= 20;
		int z1 =123;
		System.out.println((x1>y1)^(x1-y1>2)||(x1>z1));
		
		//短路逻辑运算和非短路逻辑运算
		String ssss=null;
		System.out.println(ssss!=null&&ssss.length()>2);
		System.out.println(ssss!=null&ssss.length()>2);
		
	}
}
