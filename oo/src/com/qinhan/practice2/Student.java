package com.qinhan.practice2;

public class Student extends Person {
	public static String name="student";
	public String height="student is 180";
	public Student() {
		super();
		System.out.println("我是Student类");
		System.out.println("我的父类是Person类");
		System.out.println("我没有子类");
		System.out.println("  下面证明静态属性和静态方法以及属性是否覆盖    不同则覆盖，相同则没覆盖  ");
		System.out.println("父类的静态属性name:"+super.name);
		System.out.println("子类的静态属性name:"+name);
		System.out.println("调用父类的静态方法");
		super.sayName();
		System.out.println("调用子类的静态方法");
		this.sayName();
		System.out.println("父类属性height:"+super.height);
		System.out.println("子类属性height:"+this.height);
		System.out.println("==============================");
		System.out.println("============  子类   =============");
		System.out.println();
	}
	public static void sayName() {
		System.out.println(name);
	}
	@Override
	public void sayHeight() {
		// TODO Auto-generated method stub
		super.sayHeight();
		System.out.println("我不同于父类,我要不一样的sayHeight:"+height);
	}
	
	
}
