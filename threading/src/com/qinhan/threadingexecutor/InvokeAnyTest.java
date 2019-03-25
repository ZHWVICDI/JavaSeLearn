package com.qinhan.threadingexecutor;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InvokeAnyTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// 创建一个包含固定线程的调度器
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		// 创建一个Callable任务的集合
		Set<Callable<String>> tasks = new HashSet<Callable<String>>();

		tasks.add(new Callable<String>() {

			@Override
			public String call() throws Exception {
				//这里假设我们是要寻找各种各样的资源，分3个线程来找。
				System.out.println("tyq");
				System.out.println("is");
				System.out.println("well");
				System.out.println("Task 1 找到");
				return "Task 1的返回值";
			}

		});
		tasks.add(new Callable<String>() {

			@Override
			public String call() throws Exception {
				System.out.println("zhw");
				System.out.println("is");
				System.out.println("good");
				System.out.println("Task 2 找到");
				return "Task 2 的返回值";
			}

		});
		tasks.add(new Callable<String>() {

			@Override
			public String call() throws Exception {
				System.out.println("zw");
				System.out.println("are");
				System.out.println("right");
				System.out.println("Task 3 找到");
				return "Task 31 的返回值";
			}

		});
		// 接受一个callable的集合，只要一个成功，就返回该任务的值，并且其他的任务也会结束，不再占用资源。
		//举个例子，一个海量数据文件，我们这里的三个线程任务都去找一个东西，只要一个成功找到，返回文件即可。同时关闭其他的线程任务。
		String result = executorService.invokeAny(tasks);
		System.out.println("result=" + result);
		executorService.shutdown();
	}

}
