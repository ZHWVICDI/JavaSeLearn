package com.qihan.create.builder.entity;

public class Computer {
	private CPU cpu;
	private Harddisk hd;
	private Screen screen;
	public CPU getCpu() {
		return cpu;
	}
	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}
	public Harddisk getHd() {
		return hd;
	}
	public void setHd(Harddisk hd) {
		this.hd = hd;
	}
	public Screen getScreen() {
		return screen;
	}
	public void setScreen(Screen screen) {
		this.screen = screen;
	}
	@Override
	public String toString() {
		return "Computer [cpu=" + cpu + ", hd=" + hd + ", screen=" + screen + "]";
	}
	
	
	
}
