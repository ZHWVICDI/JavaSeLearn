package com.qinhan.practice3;

public class User {
	private String usename;
	private String password;
	public String getUsename() {
		return usename;
	}
	public void setUsename(String usename) {
		this.usename = usename;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User(String usename, String password) {
		super();
		this.usename = usename;
		this.password = password;
	}
	
}
