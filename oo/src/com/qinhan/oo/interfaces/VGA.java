package com.qinhan.oo.interfaces;

public interface VGA {
	// 属性默认 public static final
 	String NAME="VGA接口";
 	//默认方法
 	default void say() {
 		System.out.println("VGA默认");
 	}
	// 方法默认是public abstract
	void inputVideo();

	void outputVideo();
}
