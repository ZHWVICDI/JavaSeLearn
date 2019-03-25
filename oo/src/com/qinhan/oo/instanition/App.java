package com.qinhan.oo.instanition;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 继承关系下的实例化过程
		// 这里请思考 继承关系的实例化过程 静态块 父-子 父->子 代码块/属性初始化 构造器
		// new Child();

		// 这里再思考 继承关系的实例化过程 由于参数中有引用类型，所以先初始化Monitor实例，传入方法参数。所以这里会有一个子类属性初始化出来哦！
		// new Child(new Monitor("实例"), 12);

		// 这里请再次思考 继承关系的实例化过程。 提示:静态代码块已经执行过一次。
		/*
		 * new Child(); new Child();
		 */

		// 1.考虑继承关系中 父子类都是默认构造方法的情况 自己注释来搞
		//new Child();
		// 2.考虑继承关系中 父子类都重载构造方法的复杂情况
		 new Child(new Monitor("hello"), 23);
		
		// 考虑一个类 调用多个构造器时的执行顺序，这里使用this调用同类构造器
		// 原则：优先保证父类的构造器稳定，然后才是子类。

		// 这里我们查看this与调用对象是否相同
		/*
		 * This t = new This(); System.out.println(t);
		 */
	}

}
