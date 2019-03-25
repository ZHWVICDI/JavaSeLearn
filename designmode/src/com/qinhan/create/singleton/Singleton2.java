package com.qinhan.create.singleton;
//懒汉模式   能提高类加载性能，但与饿汉模式的类加载内部同步机制实现线程安全不同。这个可能要注意在多线程环境下将引起异常
public class Singleton2 {
	private static Singleton2 instance;
	//这个属性是为了配合双重检查的终极版本  禁止指令重排序，让DCL(double check locking)生效
	private static volatile Singleton2 instance2;
	private Singleton2() {
		
	}
	//线程不安全的获取单例的方法
	public static Singleton2 getInstance() {
		//如果多线程同时访问可能会产生多个实例，甚至破坏实例，违背单例模式。
		if(instance==null) {
			instance=new Singleton2();
		}
		return instance;
	}
	// 通过方法同步 来保证线程安全的单例的方法 这样做效率变很低
	public static synchronized Singleton2 getInstance2() {
		if(instance==null) {
			instance=new Singleton2();
		}
		return instance;
	}
	//进一步完善这个单例模式
	public static synchronized Singleton2 getInstance3() {
		//双重检查锁   double checking lock  外层判断提高了效率
		if(instance==null) {
			synchronized (Singleton2.class) {
				//内层判断 若不为空则不建实例，保证不会出错。
				if(instance==null) {
					instance=new Singleton2();
				}
			}
		}
		return instance;
	}
	//进一步完善这个单例模式   这个才是最终正确的单例方法。
		public static synchronized Singleton2 getInstance4() {
			//双重检查锁   double checking lock  外层判断提高了效率
			if(instance2==null) {
				//同步代码块
				synchronized (Singleton2.class) {
					//内层判断 若不为空则不建实例，保证不会出错。
					if(instance2==null) {
						instance2=new Singleton2();
					}
				}
			}
			return instance2;
		}
	
}
