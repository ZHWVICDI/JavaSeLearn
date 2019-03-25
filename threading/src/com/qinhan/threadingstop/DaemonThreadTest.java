package com.qinhan.threadingstop;

public class DaemonThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaemonThread dt=new DaemonThread();
		//将该线程转换为守护线程：特点:在所有非守护线程结束，JVM会停止，然后守护线程也会随之终止。
		//必须在启动线程前：因为不能将运行中的线程转换为守护线程。
		dt.setDaemon(true);
		dt.start();
	}

}
