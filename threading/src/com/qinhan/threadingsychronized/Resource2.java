package com.qinhan.threadingsychronized;
//同步代码块  这里采用不同的监视器锁
import java.util.concurrent.TimeUnit;
//JVM中，每个对象和类都和一个监视器相关联。
//JVM维护这个锁，锁住对象，就是获得对象相关的监视器。
//一个线程可以多次对同一对象上锁。例如这里线程到达监视区域，但是已有线程访问，那么就会对对象加锁，计数器+1。
//java线程到达监视区域开始时请求一个锁，且该监视区域都与对象引用相关联例如：这里监视区域就是整个方法，关联的对象引用就是this
//所以当一个线程获取监视器锁定对象后，其他线程即便访问的是对象其他同步方法，也需要排队等候锁。
//思考这里的结果:
//线程进入监视器，然后到达监视区域后获取对象锁锁定对象，然后占据对象锁,其他线程到达后JVM计数加一，但不能调用任何方法。然后方法调用完，线程释放锁JVM计数减一，然后退出监视器。让其他线程进入。

public class Resource2 {
	//我们为不同的方法构建不同的监视器锁，使用这两个对象的锁。
	private Object syncObject1=new Object();
	private Object syncObject2=new Object();
	public void f() {
		System.out.println(Thread.currentThread().getName() + ":not synchronized in f()");
		//监视器：this对象
		synchronized (this) {
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName() + ":synchronized in f()");
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();

				}
			}
		}
	}

	public void g() {
		System.out.println(Thread.currentThread().getName() + ":not synchronized in g()");
		//监视器：使用SyncObject1的监视器
		synchronized (syncObject1) {
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName() + ":synchronized in g()");
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();

				}
			}
		}
	}

	public void h() {
		System.out.println(Thread.currentThread().getName() + ":not synchronized in h()");
		//监视器：使用syncObject2的监视器
		synchronized (syncObject2) {
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName() + ":synchronized in h()");
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();

				}
			}
		}
	}
	//由于我们的同步代码块 使用的是不同的监视器的锁，因此不同的线程调用不同方法时完全并发。
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Resource2 rs = new Resource2();
		// 这里创建线程，参数为lambda表达式来实现Runnable接口实例
		new Thread(() -> rs.f()).start();
		new Thread(() -> rs.g()).start();
		rs.h();

	}

}
