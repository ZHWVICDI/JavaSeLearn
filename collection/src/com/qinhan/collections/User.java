package com.qinhan.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class User implements java.lang.Comparable<User> {
	String name;
	int age;

	public int compareTo(User that) {
		return age - that.age;
	}

	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args){
		    List<User> ulist=new ArrayList<User>();
		    ulist.add(new User("Jerry",26));
		    ulist.add(new User("Tom",31));
		    ulist.add(new User("Jim",12));
		    ulist.add(new User("Eric",30));
		    Collections.sort(ulist);
		    
		    for(User u:ulist) {
		    	System.out.println(u);
		    }
		  }

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
}
