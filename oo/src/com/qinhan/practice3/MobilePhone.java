package com.qinhan.practice3;

public class MobilePhone extends Phone {

	public MobilePhone() {
	}

	// 构造器
	public MobilePhone(String name, double price) {
		// TODO Auto-generated constructor stub
	}

	// 实现父类的抽象方法
	@Override
	protected void doSome() {
		System.out.println("如影随形的监视人类");
	}

	@Override
	public void express(String s) {
		// TODO Auto-generated method stub
		super.express("Mobile phone express：" + s);
	}

}
