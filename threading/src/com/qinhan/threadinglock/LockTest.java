package com.qinhan.threadinglock;

//这里我们使用Lock来改进synchronized。
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {
	// 创建一个锁对象
	private Lock lock = new ReentrantLock();
	// 演示不同的锁对象进行加锁的结果
	private Lock lock2 = new ReentrantLock();
	private Lock lock3 = new ReentrantLock();
	//解答：会发生线程不同步的问题。
	public void f() {
		System.out.println(Thread.currentThread().getName() + ":not synchronized in f()");
		// 锁定，进入同步快
		lock.lock();
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName() + ":synchronized in f()");
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();

				}
			}
		} finally {
			lock.unlock();// 释放锁，离开同步块
		}
	}

	public void g() {
		System.out.println(Thread.currentThread().getName() + ":not synchronized in g()");
		// 监视器：使用SyncObject1的监视器
		lock.lock();
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName() + ":synchronized in g()");
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();

				}
			}
		} finally {
			lock.unlock();
		}
	}

	public void h() {
		System.out.println(Thread.currentThread().getName() + ":not synchronized in h()");
		// 监视器：使用syncObject2的监视器
		lock.lock();
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName() + ":synchronized in h()");
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();

				}
			}
		} finally {
			lock.unlock();
		}
	}

	// 由于我们的同步代码块 使用的是不同的监视器的锁，因此不同的线程调用不同方法时完全并发。
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final LockTest rs = new LockTest();
		// 这里创建线程，参数为lambda表达式来实现Runnable接口实例
		new Thread(() -> rs.f()).start();
		new Thread(() -> rs.g()).start();
		rs.h();

	}

}
