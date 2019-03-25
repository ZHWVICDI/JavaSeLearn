package com.qinhan.practice;
//因为子类不能继承构造器，所以我们重载一下自己的构造器，并与父类保持一致。
public class EmptyException extends Exception {

	public EmptyException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmptyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public EmptyException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public EmptyException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public EmptyException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
}
