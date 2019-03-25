package com.qinhan.gc;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
//自定义虚引用类
public class MyPhantomReference extends PhantomReference<DataClass> {
	String name;
	public MyPhantomReference(DataClass data, ReferenceQueue<DataClass> queue,String name) {
		super(data,queue);//调用父类构造方法，传入data以及queue,即引用对象，和引用队列
		this.name=name;
	}

}
//该类作为泛型
class DataClass{
	
}