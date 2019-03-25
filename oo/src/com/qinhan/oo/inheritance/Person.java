/**
 * 
 */
package com.qinhan.oo.inheritance;

/**
 * @author au
 *
 */
public class Person {
	protected String name;
	protected int age;
	protected String sex;
	
	public void run() {
		System.out.println("父类的run方法");
	}
	public static void main(String[] args) {
		Male male=new Male();
		Female female=new Female();
		male.run();//子类从父类继承了run方法
	}
}
