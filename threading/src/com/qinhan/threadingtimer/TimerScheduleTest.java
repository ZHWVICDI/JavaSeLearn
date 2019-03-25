package com.qinhan.threadingtimer;

import java.util.Timer;
import java.util.TimerTask;

public class TimerScheduleTest {

	public static void main(String[] args) {
		// 构建Timer并调度任务
		Timer timer = new Timer();
		//由于每个Timer调度器对应单一的一个线程，因此一旦任何一个任务抛出异常，调度线程就会结束，其他任务也无法继续执行。
		timer.schedule(new NormalTask(), 0,100);
		timer.schedule(new ExceptionTask(), 1000,1000);//该任务会引发异常
	}
}

//定义一个定时任务
class NormalTask extends TimerTask {
	public void run() {
		System.out.println("正常的任务");
	}
}

//定义一个定时任务  在这个任务中会引发运行时异常。
class ExceptionTask extends TimerTask {
	@Override
	public void run() {
		System.out.println("异常的任务");
		throw new RuntimeException();
	}

}
