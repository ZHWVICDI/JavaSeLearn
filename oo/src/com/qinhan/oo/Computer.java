package com.qinhan.oo;


public class Computer {
	//定义该类属性和方法，并写文档式注释，并导出该类的文档。
	//创建对象以及 直接赋值  或者  getter/setter方法
	private int computerNo;
	private String name;
	public Computer() {
	}
	/**
	 * Computer的构造方法  for test
	 * @param computerNo 电脑编号
	 * @param name	电脑名字
	 */
	public Computer(int computerNo, String name) {
		super();
		this.computerNo = computerNo;
		this.name = name;
	}
	/**
	 * Computer属性computerNo的get方法
	 * @return	返回一个int类型
	 */
	public int getComputerNo() {
		return computerNo;
	}
	public void setComputerNo(int computerNo) {
		this.computerNo = computerNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
