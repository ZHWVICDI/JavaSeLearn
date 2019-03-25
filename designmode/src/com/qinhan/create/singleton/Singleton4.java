package com.qinhan.create.singleton;
//利用枚举的特性，实现单例。 这种方式不仅能避免多线程同步问题，还能防止反序列化重新创建新的对象。
//XJad  反编译工具   ---自己查看本类编译后的结果
public enum Singleton4 {
	//唯一实例，默认为public static final 
	INSTANCE;
	//普通方法
	public void whateverMethod() {
		
	}
}
