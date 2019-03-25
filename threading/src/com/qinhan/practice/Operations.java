package com.qinhan.practice;

public class Operations {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		OpThread opthread=new OpThread();
		System.out.println("main方法  start前:"+opthread.getState());
		opthread.start();
		System.out.println("main方法  start后:"+opthread.getState());
		
		Thread.sleep(500);
		System.out.println("0.5s后"+opthread.getState());
		
		Thread.sleep(5000);
		System.out.println("5s后:"+opthread.getState());
	}
}

class OpThread extends Thread {
	public OpThread() {
		System.out.println("构造器:"+getState());
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run方法:"+getState());
		try {
			Thread.sleep(1000);
			System.out.println("休眠以后:"+getState());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
