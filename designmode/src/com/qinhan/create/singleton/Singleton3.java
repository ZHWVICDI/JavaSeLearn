package com.qinhan.create.singleton;
//懒汉单例 采用静态内部类 对上面一个单例的改进
public class Singleton3 {
	//静态内部类			
	/*内部类（不论是静态内部类还是非静态内部类）都是在第一次使用时才会被加载。
	 *  外部类不调用 getInstance（）时候 内部类是不会加载的，所以达到了懒汉的效果*/
	private static class SingletonHolder{
		private static final Singleton3 INSTANCE=new Singleton3();
	}
	private Singleton3() {}
	//第一次访问时加载SingletonHolder类并初始化实例
	public static final Singleton3 getInstance() {
		return SingletonHolder.INSTANCE;
	}
}
