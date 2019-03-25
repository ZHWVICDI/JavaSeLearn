package com.qinhan.create.builder1;

import com.qihan.create.builder.entity.Computer;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComputerDirector cd=new ComputerDirector();
		Computer pc=cd.buildComputer();
		System.out.println(pc.toString());
	}

}
