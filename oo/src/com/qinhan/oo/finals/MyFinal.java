package com.qinhan.oo.finals;

//final修饰的类不能被继承
public final class MyFinal {
	// 注意：这里相对于final修饰的区别 占用的资源少，且只加载一次。一般通用，因为不可更改。
	// 注意：这里的名字格式全大写；
	public static final String APP_VERSION = "2.3";
	public final int x = 10;
	public final int[] y = { 1, 3, 5 };

	{
		// final修饰的值不能更改
		// x=11;
		// final修饰的引用类型的内容可以更改，但是指向不可更改
		y[0] = 2;
		// y=new int[3];
	}

	// final修饰方法 该方法不能被子类覆盖。
	public final void doIt() {

	}
}
