package com.qinhan.classexecise;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Ex {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//单线程线程池
		ExecutorService ex = Executors.newSingleThreadExecutor();
		Future<String> result = ex.submit(() -> {
			System.out.println("一个线程！");
			return	Thread.currentThread().getName()+"  返回值给你";
		});	
		System.out.println(result.get());
		ex.shutdown();
	}
}
