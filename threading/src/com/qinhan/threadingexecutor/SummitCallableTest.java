package com.qinhan.threadingexecutor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SummitCallableTest {
	public static void main(String[] args) throws Exception {
		ExecutorService executorService=Executors.newSingleThreadExecutor();
		//submit 且传入 callable参数可以返回 结果
		Future future=executorService.submit(()->{
			System.out.println("Callable异步任务");
			return "Callable的执行结果为哈哈哈";
		});
		System.out.println("future.get():="+future.get());
		executorService.shutdown();
	}
}
