package com.qinhan.threadingexecutor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SubmitRunnableTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ExecutorService executorService=Executors.newSingleThreadExecutor();
		//通过submit方式提交任务，会返回一个Future对象
		Future future=executorService.submit(()->{
			System.out.println("submit方式提交的异步任务");
		});
		//调用get方法会导致线程阻塞直到异步任务完成，Runnable无法返回结果，因此始终返回null
		System.out.println("future.get()="+future.get());
		executorService.shutdown();
	}

}
