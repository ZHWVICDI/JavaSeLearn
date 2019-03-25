package com.qinhan.practice;

public class Master {
	private int hp;
	private  int level;
	public Master(int level) {
		super();
		this.level = level;
		this.hp=level*1000;
	}
	public void beAtk(Hero h) {
		// TODO Auto-generated method stub
		this.hp-=h.getAtk();
		System.out.println("怪物生命值减少"+h.getAtk()+"变为"+hp);
	}
	
}
