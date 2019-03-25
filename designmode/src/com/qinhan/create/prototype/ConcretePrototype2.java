package com.qinhan.create.prototype;
//ConcretePrototype   实现一个克隆自身的操作      Java通过实现Cloneable接口，并重写Object的clone方法
public class ConcretePrototype2 implements Prototype {
	private String name2;
	private int age2;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
