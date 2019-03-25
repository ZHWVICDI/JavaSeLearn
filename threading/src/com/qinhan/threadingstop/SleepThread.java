package com.qinhan.threadingstop;
//该线程会因为线程方法sleep的调用进入阻塞状态，我们这里就是演示此种线程的安全退出
//通过调用线程的interrupt方法使线程抛出中断异常，然后线程捕捉这个异常，更改共享变量，让线程自然消亡。
public class SleepThread extends Thread {
	boolean flag=true;
	@Override
	public void run() {
		while (flag) {
			//这里使该线程进入阻塞状态，此时更改flag无效
			//在app中调用interrupt使该线程抛出中断异常，然后捕捉中断异常，然后改变共享变量，使退出线程。
			try {
				Thread.sleep(1000*60*60);
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println("线程执行被中断！");
				//改变共享变量的值，使退出循环，然后线程自然消亡
				flag=false;
			}
		}
	}

}
