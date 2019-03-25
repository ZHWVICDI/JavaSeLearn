package com.qinhan.threadingexecutor;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class InvokeAllTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// 创建一个任务调度器
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		// 创建一个Callable任务的集合
		Set<Callable<String>> tasks = new HashSet<Callable<String>>();
		tasks.add(new Callable<String>() {

			@Override
			public String call() throws Exception {
				return "Task 1 的返回值";
			}

		});
		tasks.add(new Callable<String>() {
			
			@Override
			public String call() throws Exception {
				return "Task 2 的返回值";
			}
			
		});
		tasks.add(new Callable<String>() {
			
			@Override
			public String call() throws Exception {
				return "Task 3 的返回值";
			}
			
		});
		
		//接受一个callable集合，返回包含Future对象的集合，可通过这个集合了解所有Callable任务的返回值；任务可能因为异常而结束，这个我们无法通过Future来获取这个信息。
		//同样的例子，海量数据文件系统，我们需要找出所有相似的文件，那么分线程去做。找到后返回一个结果的集合。
		Collection<Future<String>> futures=executorService.invokeAll(tasks);
		//遍历Callable任务返回的结果
		Iterator it=futures.iterator();
		while(it.hasNext()) {
			Future<String> future=(Future<String>) it.next();
			System.out.println("future.get()="+future.get());
		}
		executorService.shutdown();
	}

}
