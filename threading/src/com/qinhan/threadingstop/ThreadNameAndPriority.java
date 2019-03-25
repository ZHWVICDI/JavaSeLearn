package com.qinhan.threadingstop;

public class ThreadNameAndPriority {

	public static void main(String[] args) {
		//创建一个线程组，最大优先级与main相同为5
		ThreadGroup group=new ThreadGroup("ZHW线程组");
		//创建一个线程，并绑定到线程组
		Thread thread1=new Thread(group,"ZHW thread-1");
		//这里没有取名，所以会有一个默认的thread名字
		Thread thread2=new Thread();
		//设置线程优先级为最大优先级
		thread2.setPriority(Thread.MAX_PRIORITY);
		System.out.println(thread1);
		System.out.println(thread2);
	}

}
