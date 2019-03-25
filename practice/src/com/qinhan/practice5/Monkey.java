package com.qinhan.practice5;

public class Monkey extends Thread{
	private static Object o=new Object();
	private int brickToMove;
	private String name;
	
	
	public Monkey(String name,int brickToMove) {
		super();
		this.name=name;
		this.brickToMove = brickToMove;
	}

	 public void arrived() throws InterruptedException {
		synchronized (o) {
			System.out.println(name+"签到中"+"接下来3秒不能签到");
			Thread.sleep(3000);
			System.out.println(name+"签到成功");
		}
	}
	
	 public void leave() {
		synchronized (o) {
			System.out.println(name+"签退中"+"接下来3秒不能签到");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name+"签退成功");
		}
	}
	
	public void moveBrick() {
		brickToMove--;
		System.out.println("搬了一块砖");
	}
	@Override
	public void run() {
		try {
			arrived();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for(int i=0;i<brickToMove;i++) {
			System.out.println(name+"搬今天的第"+i+"个砖");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		leave();
	}
}
