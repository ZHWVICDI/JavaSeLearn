package com.qinhan.threadingThreadPool;
//执行线程:
public class ExecutorThread extends Thread {
	//用于描述线程是否处于运行状态。
	boolean runningFlag=false;
	private Runnable callBack=null;
	public void setCallBack(Runnable callBack) {
		this.callBack=callBack;
	}
	public synchronized void setRunning(boolean flag) {
		runningFlag=flag;
		if(flag) {
			//如果flag为true说明希望执行线程处理某一个具体的任务，则唤醒某个线程。
			this.notify();
		}
	}
	public synchronized void run() {
		try {
			while(true) {
				//任务执行结束后阻塞本线程
				if(!runningFlag) {
					this.wait();
				}else {
					callBack.run();
					setRunning(false);
				}
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
