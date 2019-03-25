package com.qinhan.threadingsemaphore;

public class WareHouse {
	// 相当于生产-消费模式中的empty
	final Semaphore notFull = new Semaphore(10);
	// full --表示缓冲区是否为满
	final Semaphore notEmpty = new Semaphore(0);
	//mutex==用于互斥
	final Semaphore mutex = new Semaphore(1);
	//模拟货物
	final  String[] itemsStrings=new String[10];
	int putptr,takeptr,count;
	public void put(String x) throws InterruptedException{
		//P(empty)--保证非满
		notFull.acquire();
		//p(mutex)
		mutex.acquire();//保证不冲突
		try {//增加库存
			itemsStrings[putptr]=x;
			if(++putptr==itemsStrings.length)
				putptr=0;
			++count;
		} finally {
			//V(mutex)
			mutex.release();
			//V(full)
			notEmpty.release();
		}
	}
	
	public String take() throws InterruptedException {
		//P(full) 保证非空
		notEmpty.acquire();
		//P(mutext) 
		mutex.acquire();
		try {
			String xString=itemsStrings[takeptr];
			if(++takeptr==itemsStrings.length)
				takeptr=0;
			--count;
			return xString;
		} finally {
			mutex.release();
			notFull.release();
		}
	}
	
}