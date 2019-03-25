package com.qinhan.practice4;

public class Udevice implements USBI {
	private String data;

	public Udevice(String data) {
		super();
		this.data = data;
	}

	public Udevice() {
		// TODO Auto-generated constructor stub
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
