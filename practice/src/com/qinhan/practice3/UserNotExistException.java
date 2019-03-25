package com.qinhan.practice3;

//用于表示用户登录时不存在的异常
public class UserNotExistException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String msg;
	public UserNotExistException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserNotExistException(String message) {
		super(message);
		this.msg=message;
		// TODO Auto-generated constructor stub
	}
	
}
