package com.qinhan.threadingsemaphore;

import java.util.Random;

public class Producer implements Runnable {
	static int num=1;
	Random random=new Random();
	public String getRandomCharList(char[] randomElement,int stringLength) {
		String resultString="";
		StringBuffer tempSBuffer=new StringBuffer();
		int i=-1;
		int randomIndex=-1;
		for(i=0;i<stringLength;i++) {
			randomIndex=Math.abs(random.nextInt()%randomElement.length);
		}
		return null;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}
