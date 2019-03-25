package com.qinhan.practice4;

public class USBdevice implements USBI {
	private String data;

	public USBdevice() {
		// TODO Auto-generated constructor stub
	}

	public USBdevice(String data) {
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
