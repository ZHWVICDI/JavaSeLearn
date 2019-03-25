package com.qinhan.threadingstop;

public class StopSleepThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SleepThread st=new SleepThread();
		st.start();
		st.interrupt();//中断线程，此时线程代码将抛出InterruptedException
	}

}
