package com.qinhan.practice;

public class APP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusicPlayer mp=new MusicPlayer(new CommonCPU(), new AIos(),new TfStoreDevice());
		mp.start();
		mp.play("zhw.mp3");
	}

}
