package com.qinhan.oo.interfaces;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VGA vga=new Computer();
		//该默认方法仍然被实现类继承下来
		vga.say();
	}

}
