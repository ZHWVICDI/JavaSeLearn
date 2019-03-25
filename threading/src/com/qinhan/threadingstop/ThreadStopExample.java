package com.qinhan.threadingstop;

//使用共享变量，停止线程的实例
public class ThreadStopExample extends Thread {
	//线程的共享变量
	private boolean flag=true;
	//修改共享变量，促使run方法循环结束，从而使线程自然消亡
	public void stopThread() {
		flag=false;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(flag) {
			
		}
		System.out.println(flag);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadStopExample tse=new ThreadStopExample();
		tse.start();
		for(int i=0;i<1000;i++) {
			
		}
		tse.stopThread();
	}

}
