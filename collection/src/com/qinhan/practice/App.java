package com.qinhan.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Integer> nums=new ArrayList<Integer>();
		nums.add(2);
		nums.add(199);
		nums.add(20);
		nums.add(1);
		//1
		for(Integer num :nums) {
			System.out.println(num);
		}
		//2
		Iterator<Integer> it=nums.iterator();
		while(it.hasNext()) {
			Integer num=it.next();
			System.out.println(num);
		}
		//3
		nums.forEach(x->System.out.println(x));
		Comparator<User> comparator=new Comparator<User>() {

			@Override
			public int compare(User o1, User o2) {
				// TODO Auto-generated method stub
				return o1.getBalance()-o2.getBalance();
			}
			
		};
		
		//按年龄排序
		TreeSet<User> users=new TreeSet<User>();
		users.add(new User(1000,19));
		users.add(new User(500,49));
		users.add(new User(1200,23));
		System.out.println("按年龄排序:"+users);
		
		TreeSet<User> users2=new TreeSet<User>(comparator);
		users2.add(new User(1000,19));
		users2.add(new User(500,49));
		users2.add(new User(1200,23));
		System.out.println("按工资排序："+users2);
	}
}
