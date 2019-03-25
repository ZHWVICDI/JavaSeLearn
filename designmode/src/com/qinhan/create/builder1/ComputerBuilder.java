package com.qinhan.create.builder1;

import com.qihan.create.builder.entity.CPU;
import com.qihan.create.builder.entity.Computer;
import com.qihan.create.builder.entity.Harddisk;
import com.qihan.create.builder.entity.Screen;

public class ComputerBuilder {
	private Computer computer;
	
	public ComputerBuilder() {
		computer=new Computer();
	}
	public ComputerBuilder buildCPU(String brand) {
		CPU cpu=new CPU();
		cpu.setBrand(brand);
		computer.setCpu(cpu);
		return this;
	}
	public ComputerBuilder buildHarddisk(int capacity) {
		Harddisk hd=new Harddisk();
		hd.setCapacity(capacity);
		computer.setHd(hd);
		return this;
	}
	public ComputerBuilder buildScreen(int width, int height) {
		Screen sc=new Screen();
		sc.setHeight(height);
		sc.setWidth(width);
		computer.setScreen(sc);
		return this;
	}
	public Computer build() {
		return computer;
	}
}
