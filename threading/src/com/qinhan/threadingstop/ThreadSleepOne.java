package com.qinhan.threadingstop;

public class ThreadSleepOne implements Runnable {
	public String name;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			try {
				// 阻塞100毫秒
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + " :" + i);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建两个线程 请思考这两个线程的运行过程 (每个线程循环一次会调用sleep方法阻塞
		ThreadSleepOne one = new ThreadSleepOne();
		ThreadSleepOne two = new ThreadSleepOne();
		one.name = "one";
		two.name = "two";
		Thread t1 = new Thread(one);
		Thread t2 = new Thread(two);

		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);

		t1.start();
		t2.start();
	}

}
