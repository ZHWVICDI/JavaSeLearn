package com.qinhan.threadingThreadPool;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreadPoolExecutor {
	//池容器
	private List<ExecutorThread> threads;
	//构造方法：创建指定数量的线程并启动并将其放入池容器。
	private ThreadPoolExecutor(int threadCount) {
		threads=Collections.synchronizedList(new ArrayList<ExecutorThread>());
		for(int i=1;i<=threadCount;i++) {
			ExecutorThread thread=new ExecutorThread();
			threads.add(thread);
			thread.start();
		}
	}
	//从线程池中选择一个空闲的线程执行任务
	public void execute(Runnable callBack) {
		int i;
		for(i=0;i<threads.size();i++) {
			ExecutorThread currentThread=threads.get(i);
			if(!currentThread.runningFlag) {
				currentThread.setCallBack(callBack);
				currentThread.setRunning(true);
				return;
			}
		}
		if(i==threads.size()) {
			System.out.println("线程资源已经用完，请稍等片刻再申请资源");
		}
	}
}
