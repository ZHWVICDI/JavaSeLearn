package com.qinhan.threadingstop;

public class JoinApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread1=new Thread(new JoinTester("One"));
		Thread thread2=new Thread(new JoinTester("Two"));
		thread1.start();
		thread2.start();
		try {
			//这里演示join方法的使用：即当前线程(main)阻塞等待调用方法的线程(thread1)结束后才继续运行
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("主线程结束");
	}

}
