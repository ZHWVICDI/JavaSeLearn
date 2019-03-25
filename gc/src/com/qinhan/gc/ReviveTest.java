package com.qinhan.gc;
//演示对象复活过程。
public class ReviveTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("垃圾回收前(没有指向对象):"+ReviveByFinalize.caseForRevive);
		ReviveByFinalize.caseForRevive=new ReviveByFinalize();
		System.out.println("垃圾回收前(指向对象):"+ReviveByFinalize.caseForRevive);
		//然后我取消对引用对象的引用，使其成为垃圾
		ReviveByFinalize.caseForRevive=null;
		System.gc();//请求gc进程
		Thread.sleep(1000);
		//垃圾回收后我们再次输出   这里复活了该引用，此时引用指向原对象
		System.out.println("垃圾回收后:"+ReviveByFinalize.caseForRevive);
		//这里我们再次取消对引用对象的引用，使其成为垃圾。
		ReviveByFinalize.caseForRevive=null;
		System.out.println("垃圾回收后(且没有指向对象):"+ReviveByFinalize.caseForRevive);
		//再次回收
		System.gc();
	}

}
