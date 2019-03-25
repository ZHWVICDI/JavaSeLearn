package com.qinhan.practice4;

public class Mobile implements USBI {
	private String data;

	public Mobile() {
		// TODO Auto-generated constructor stub
	}

	public Mobile(String data) {
		super();
		this.data = data;
	}

	@Override
	public String readData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String writeData() {
		return data;
		// TODO Auto-generated method stub

	}

}
