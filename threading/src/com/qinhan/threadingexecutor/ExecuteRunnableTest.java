package com.qinhan.threadingexecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuteRunnableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建一个任务调度器
		ExecutorService executorService=Executors.newSingleThreadExecutor();
		//调度任务
		executorService.execute(()->{
			System.out.println("执行异步任务");
		});
		executorService.shutdown();
	}

}
