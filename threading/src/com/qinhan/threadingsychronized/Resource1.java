package com.qinhan.threadingsychronized;
//同步代码块
import java.util.concurrent.TimeUnit;
//JVM中，每个对象和类都和一个监视器相关联。
//JVM维护这个锁，锁住对象，就是获得对象相关的监视器。
//一个线程可以多次对同一对象上锁。例如这里线程到达监视区域，但是已有线程访问，那么就会对对象加锁，计数器+1。
//java线程到达监视区域开始时请求一个锁，且该监视区域都与对象引用相关联例如：这里监视区域就是整个方法，关联的对象引用就是this
//所以当一个线程获取监视器锁定对象后，其他线程即便访问的是对象其他同步方法，也需要排队等候锁。
//思考这里的结果:
//线程进入监视器，然后到达监视区域后获取对象锁锁定对象，然后占据对象锁,其他线程到达后JVM计数加一，但不能调用任何方法。然后方法调用完，线程释放锁JVM计数减一，然后退出监视器。让其他线程进入。

public class Resource1 {
	// synchronized同步方法 synchronized表示监视区域为整个方法，监视区域相关联的对象引用为this
	// synchronized会降低程序的性能
	public void f() {
		// 这段代码演示非临界区代码块的执行情况
		System.out.println(Thread.currentThread().getName() + ":not synchronized in f()");
		// 这里是同步代码块
		// 可以适当降低同步方法的性能的消耗
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
		// 这段代码演示非临界区代码块的执行情况
		System.out.println(Thread.currentThread().getName() + ":not synchronized in g()");
		// 这里是同步代码块
		// 可以适当降低同步方法的性能的消耗
		synchronized (this) {
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
		// 这段代码演示非临界区代码块的执行情况
		System.out.println(Thread.currentThread().getName() + ":not synchronized in h()");
		// 这里是同步代码块
		// 可以适当降低同步方法的性能的消耗
		synchronized (this) {
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
//这里同步代码块且使用的监视器都是this对象  所以没有放入同步块的是完全并发的，放入同步块的是同步的。
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Resource1 rs = new Resource1();
		// 这里创建线程，参数为lambda表达式来实现Runnable接口实例
		new Thread(() -> rs.f()).start();
		new Thread(() -> rs.g()).start();
		rs.h();

	}

}
