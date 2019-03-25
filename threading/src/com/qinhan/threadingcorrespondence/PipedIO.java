package com.qinhan.threadingcorrespondence;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.util.Random;
//通过管道流来实现不同线程之间的相互通信
public class PipedIO{
	public static void main(String[] args) throws IOException {
		//创建并启动两个线程
		Sender sender=new Sender();
		Receiver receiver=new Receiver(sender);
		sender.start();
		receiver.start();
	}
}

class Sender extends Thread {
	private Random rand=new Random();
	//管道输出流  -- 用于向管道写入数据
	public PipedWriter out=new PipedWriter();
	
	public PipedWriter getOut() {
		return out;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			for(char c='A';c<='z';c++) {
				try {
					out.write(c);
					sleep(rand.nextInt(500));
				}catch(Exception e) {
					throw new RuntimeException(e);
				}
			}
		}
	}
}

class Receiver extends Thread{
	//从要通信的线程的输出流获得输入流。
	private PipedReader in;
	public Receiver(Sender sender) throws IOException {
		in=new PipedReader(sender.getOut());
	}
	@Override
	public void run() {
		try {
			while(true) {
				//从管道输入流中读取管道数据  该数据是另一个线程写入的
				System.out.println("Read:"+(char)in.read());
			}
		}catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
}
