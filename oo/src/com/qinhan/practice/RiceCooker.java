package com.qinhan.practice;

public class RiceCooker {
	private int capacity;
	private long time;
	private String name=new String("112");
	{
		System.out.println("代码块");
		System.out.println("代码块中:"+capacity+" "+time+" "+name);
		name="代码块中为我取得名";
	}
	static{
		System.out.println("静态代码块");
	}
	public RiceCooker() {
		System.out.println("构造器中:"+capacity+" "+time+" "+name);
		System.out.println("构造器");
		// TODO Auto-generated constructor stub
	}
	public RiceCooker( long time, String name) {
		super();
		this.time = time;
		this.name = name;
	}
	
}	
