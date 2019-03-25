package com.qinhan.threadingstop;

//实现Runnable接口并重写run方法
public class ThreadYieldOne implements Runnable {
	public String name;

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			// 每循环一次调用yield方法让当前线程进入就绪状态
			Thread.yield();
			System.out.println(name + " :" + i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 这里创建并运行这两个线程 请思考线程运行结果
		ThreadYieldOne one = new ThreadYieldOne();
		ThreadYieldOne two = new ThreadYieldOne();
		one.name = "one";
		two.name = "two";
		Thread t1 = new Thread(one);
		Thread t2 = new Thread(two);
		//在这里更改线程优先级  再次思考线程运行过程
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		System.out.println(t1);
		System.out.println(t2);
		t1.start();
		t2.start();
	}

}
