package com.qinhan.practice;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rocket r=new Rocket();
		Rocket rWithHeight=new Rocket(190);
		r.fly();
		rWithHeight.fly(189);
		
		RiceCooker rc=new RiceCooker();
		Hero h=new Hero(10000,10,100);
		Master m=new Master(10);
		for(int i=0;i<100;i++) {
			h.atk(m);
		}
		
	}

}
