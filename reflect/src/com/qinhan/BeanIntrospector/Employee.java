package com.qinhan.BeanIntrospector;

public class Employee {
	private String name;
	private int salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	//age将被内省认为是属性  即使该类中没有声明这个属性
	public int getAge(){
	  return 18;
	}
	//score将被内省认为是属性
	public void setScore(int score){
	  
	}
}
