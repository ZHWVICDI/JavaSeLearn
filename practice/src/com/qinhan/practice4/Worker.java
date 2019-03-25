package com.qinhan.practice4;

public class Worker implements Comparable<Worker>{
	private String name;
	private int age;
	private String type;
	
	public Worker() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Worker(String name, int age, String type) {
		super();
		this.name = name;
		this.age = age;
		this.type = type;
	}

	@Override
	public int compareTo(Worker o) {
		// TODO Auto-generated method stub
		return this.age-o.age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Worker [name=" + name + ", age=" + age + ", type=" + type + "]";
	}
	
	
}
