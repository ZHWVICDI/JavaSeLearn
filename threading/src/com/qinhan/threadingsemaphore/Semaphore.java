package com.qinhan.threadingsemaphore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Semaphore {
	//相当于该信号量的等待队列
	private List<Object> locks=Collections.synchronizedList(new ArrayList<Object>());
	private int permitNum=1;
	private int nowPermitNum=1;
	private boolean permitNumGrow=false;
	private boolean fair=false;
	Random random=new Random();
	public Semaphore(int permitNum, boolean permitNumGrow, boolean fair) {
		//信号量的初值
		this.permitNum = permitNum;
		//表示该信号量的当前值
		this.nowPermitNum=permitNum;
		this.permitNumGrow = permitNumGrow;
		this.fair = fair;
	}
	public Semaphore(int permitNum) {
		this(permitNum,true,false);
	}
	public Semaphore() {
		this(1);
	}
	//java方式实现的P操作
	public void acquire() {
		Object lock=new Object();
		synchronized (lock) {
			if(nowPermitNum>0) {
				nowPermitNum--;
			}else {
				//将该锁放入等待队列中
				locks.add(lock);
				try {
					lock.wait();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	//java实现的V操作
	public void release() {
		if(locks.size()>0) {
			int index=0;
			if(!fair) {
				index=Math.abs(random.nextInt()%locks.size());
			}
			//获取等待的锁的对象,然后将其从等待队列中移除。
			Object lock=locks.get(index);
			locks.remove(lock);
			synchronized (lock) {
				//唤醒一个等待的线程
				lock.notify();
			}
		}else if(nowPermitNum<permitNum||permitNumGrow) {
			//唤醒一个等待的线程
			nowPermitNum++;
		}
	}
	//获取当前信号量的值。
	public int getAvailablePermitNum() {
		return nowPermitNum;
	}
	
}
