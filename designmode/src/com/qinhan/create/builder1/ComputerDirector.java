package com.qinhan.create.builder1;

import com.qihan.create.builder.entity.Computer;

public class ComputerDirector {
	public Computer buildComputer() {
		ComputerBuilder cb=new ComputerBuilder();
		Computer computer=cb.buildCPU("Intel i7").buildHarddisk(100).buildScreen(100, 200).build();
		return computer;
	}
	
}	
