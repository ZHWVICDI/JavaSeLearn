package com.qinhan.practice;

public class Rocket {
	private long height;
	private String engine;
	private float speed;
	
	public Rocket() {
		
	}
	public Rocket(long h,String e) {
		this.engine=e;
		this.height=h;
	}
	
	public Rocket(long h) {
		this.height=h;
	}
	
	public void  fly() {
		System.out.println("默认速度飞行");
		
	}
	public float fly(float speed) {
		System.out.println(speed+"速度飞行");
		return speed;
	}
}
