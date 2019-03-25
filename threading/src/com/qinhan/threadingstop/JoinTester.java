package com.qinhan.threadingstop;

import java.util.Date;

public class JoinTester implements Runnable {
	private String name;
	
	

	public JoinTester(String name) {
		this.name=name;
		// TODO Auto-generated constructor stub
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(name+"线程开始于:"+new Date());
		try {
			Thread.sleep(4000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name+"线程结束于:"+new Date());
	}

}
