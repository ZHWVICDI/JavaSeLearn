package com.zhw.first;

public class boxingUnboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//传统的装箱、拆箱
		//1.
		int a=128;
		Integer ao1=new Integer(a);//装箱
		int b1=ao1.intValue();//拆箱
		//2.
		//使用包装器类的valueof静态方法实现装箱
		Integer wx=Integer.valueOf(10);
		//使用包装器类的XxxValue方法来实现拆箱
		int x=wx.intValue();
		
		//这个无关装箱拆箱。
		//使用包装器类的parseXxx方法来实现string转Integer
		String wx2="123";
		Integer xxx=Integer.parseInt(wx2);
		System.out.println(xxx);
		
		//自动装箱   
		int a1=128;
		Integer ao2=a1;
		Integer ao3=128;
		//自动拆箱
		int b2=ao2;
		int b3=ao2+ao3;
		//注意：自动拆箱装箱  直接用=赋值来转换即可。
		
		//自动装箱拆箱的池操作   在自动装箱拆箱过程中，当数值在byte范围内时，java才会采用常量池(cache)，否则开辟新的内存空间
		Integer i1=10;
		Integer i2=10;
		//这里并没有自动拆装箱，所以是开辟新的内存空间。
		Integer io1=new Integer(10);
		Integer io2=new Integer(10);
		Integer i3=10000;
		Integer i4=10000;
		//请自行思考下下面的结果并说出理由
		System.out.println("i1==i2:"+(i1==i2));
		System.out.println("io1==io2:"+(io1==io2));
		System.out.println("i3==i4:"+(i3==i4));
		
		//其他数据类型的拆装箱 
		boolean b=false;
		Boolean b11=Boolean.valueOf(b);// .valueOf
		Boolean b22=new Boolean(b);//构造器
		boolean bb=b11.booleanValue();//xxxValue
		
		
	}

}
