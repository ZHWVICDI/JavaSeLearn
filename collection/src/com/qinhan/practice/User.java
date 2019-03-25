package com.qinhan.practice;

public class User implements Comparable<User>{
	private int balance;
	private int age;
	
	public User(int balance, int age) {
		super();
		this.balance = balance;
		this.age = age;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [balance=" + balance + ", age=" + age + "]";
	}
	@Override
	public int compareTo(User o) {
		// TODO Auto-generated method stub
		return this.age-o.age;
	}
	
}
