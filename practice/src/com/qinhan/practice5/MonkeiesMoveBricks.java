package com.qinhan.practice5;

public class MonkeiesMoveBricks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		new Monkey("m1",10).start();
		new Monkey("m2",20).start();
		new Monkey("m3",20).start();
		new Monkey("m4",10).start();
		new Monkey("m5",30).start();
		Thread.sleep(20000);
		System.out.println("今日结束");
	}

}
