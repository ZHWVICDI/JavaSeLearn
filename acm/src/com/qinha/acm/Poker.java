package com.qinha.acm;

public class Poker {
	//花色
	private String color;
	//代表  A 1 2 3 .... J Q K
	private String symbol;
	//值
	
	private int value;
	public Poker(String color, String symbol) {
		super();
		this.color = color;
		this.symbol = symbol;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	
}
