package com.qinhan.threadingcorrespondence;

//Java内建等待机制来改进忙等待方式的鸡蛋收获流程
public class EggTest {
	volatile boolean hasEggs = false;
	Object flag = new Object();
	Thread human = new Thread(() -> {
		while (true) {
			if (!hasEggs) {
				// 同步代码块  wait方法的调用必须在sychronized代码块中
				synchronized (flag) {
					try {
						System.out.println("等待收获");
						// 让该线程进入非运行状态，并等待信号。
						flag.wait();
					} catch (InterruptedException e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				}
			}else {
				System.out.println("收获");
				hasEggs=false;
			}
		}
	});
	Thread hen=new Thread(()->{
		while(true) {
			try {
				Thread.sleep(1000);
				System.out.println("可以收获");
				hasEggs=true;
				synchronized (flag) {
					flag.notify();
				}
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	});

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EggTest et=new EggTest();
		et.human.start();
		et.hen.start();
	}

}
