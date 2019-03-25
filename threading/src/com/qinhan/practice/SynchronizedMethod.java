package com.qinhan.practice;

public class SynchronizedMethod {
	public static void main(String[] args) throws InterruptedException {
		Truck bs = new Truck();
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 50; i++) {
				bs.addbrick();
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 50; i++) {
				bs.addbrick();
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		t1.start();
		t2.start();
		Thread.sleep(30 * 1000);
		System.out.println(bs.getCount());
	}
}

class Truck {
	private int count = 0;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	synchronized void addbrick() {
		count++;
	}
}