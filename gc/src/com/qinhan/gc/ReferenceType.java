package com.qinhan.gc;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
//引用类型
public class ReferenceType {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//强引用  这里的str对后面对象的引用
		String str=new String("abc");
		//软引用  这里softRef对str2对象就是软引用  可与ReferenceQueue结合实现内存敏感缓存
		String str2=new String("abc");
		SoftReference<String> softRef=new SoftReference<String>(str2);
		//弱引用  这里的weakRef对str3对象的引用就是弱引用。 	
		String str3=new String("abc");
		WeakReference<String> weakRef=new WeakReference<String>(str3);
		//虚引用   注意：虚引用必须与引用队列联合使用(这里phantomRef绑定到ReferenceQueue)  这里phantomRef对str4的引用为虚引用。
		String str4=new String("abc");
		ReferenceQueue<String> queue=new ReferenceQueue<String>();
		//注意这里的构造方法需要两个参数
		PhantomReference<String> phantomRef=new PhantomReference<String>(str4, queue);
	}

}
