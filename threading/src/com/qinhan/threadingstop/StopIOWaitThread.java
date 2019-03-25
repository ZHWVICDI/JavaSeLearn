package com.qinhan.threadingstop;

import java.util.Scanner;

public class StopIOWaitThread{
	public static void main(String[] args) {
		IOWaitThread iot=new IOWaitThread();
		iot.start();
		//这里通过关闭底层资源，线程读取操作将引发一场，中断线程执行。
		iot.scanner.close();
	}
}

class IOWaitThread extends Thread {
	Scanner scanner=new Scanner(System.in);
	boolean flag=true;
	
	@Override
	public void run() {
	while(flag) {
		try {
			scanner.nextLine();
		} catch (Exception e) {
			System.out.println("线程中断！");
			flag=false;
		}
	}
	}
	
}
