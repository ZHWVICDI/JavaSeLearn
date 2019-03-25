package com.qinhan.practice;

public class Hero {
	private int exp;
	private int level;
	private int atk;

	public Hero(int exp, int level, int atk) {
		super();
		this.exp = exp;
		this.level = level;
		this.atk = atk;
	}
	public void atk(Master m) {
		m.beAtk(this);
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	
	
}
