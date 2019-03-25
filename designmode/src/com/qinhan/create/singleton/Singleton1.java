package com.qinhan.create.singleton;
//饿汉模式的singleton  类加载慢，但获取对象快
//并且避免了多线程的同步问题(因为静态初始化将保证任何线程能够访问到域之前就初始化它)
public class Singleton1 {
	//自己持有私有的唯一实例
	private static Singleton1 instance=new Singleton1();
	
	//另一种写法
	private static Singleton1 instance2=null;
	static {
		instance2=new Singleton1();
	}
	
	//构造器私有化，防止外界访问
	private Singleton1() {
	}
	//通过公开的getInstance方法获取该类唯一实例
	public static Singleton1 getInstance() {
		return instance;
	}
	
}
