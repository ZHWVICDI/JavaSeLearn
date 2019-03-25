package com.qinhan.practice;

public class MusicPlayer {
	private CPUI cpu;
	private OSI os;
	private StoreDevice sd;
	//private 
	
	public MusicPlayer(CPUI cpu, OSI os, StoreDevice sd) {
		super();
		this.cpu = cpu;
		this.os = os;
		this.sd = sd;
	}
	public void start() {
		System.out.println("启动音乐播放器");
		os.bootloader();
		System.out.println("系统已经启动");
	}
	//播放器的play方法
	public void play(String fileName) {
		System.out.println("音乐播放：");
		os.paly(fileName,cpu,sd);
	}

}
