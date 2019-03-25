package com.qinhan.gc;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
//探索虚引用与引用队列的关系。
public class PhantomReferenceTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DataClass data=new DataClass();
		ReferenceQueue<DataClass> queue=new ReferenceQueue<DataClass>();
		//创建自定义虚引用对象 并给data对象一个虚引用。
		MyPhantomReference phantomRef=new MyPhantomReference(data, queue, "test!");
		//引用置空，那么此时原来引用的对象此时只具备虚引用，一旦GC执行，该对象的引用对象(即phantomRef将被加入引用队列)
		data=null;
		//调用gc进程
		System.gc();
		Thread.sleep(200);
		Reference ref=null;
		//这里我们执行出队，获取被回收对象的引用对象
		while((ref=queue.poll())!=null) {
			System.out.println(((MyPhantomReference)ref).name);
		}
	}

}
