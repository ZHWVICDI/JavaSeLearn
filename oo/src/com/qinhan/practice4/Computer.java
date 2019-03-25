package com.qinhan.practice4;

public class Computer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Udevice ud=new Udevice("U盘数据");
		USBdevice ubd=new USBdevice("USB数据");
		Mobile m =new Mobile("手机数据");
		readData(m);
		readData(ubd);
		readData(ud);
	}
	public static void readData(USBI usbi) {
		System.out.println("读取"+usbi.writeData()+"ing");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("读取失败");
		}
		System.out.println("读取"+usbi.writeData()+"完毕");
	}

}
