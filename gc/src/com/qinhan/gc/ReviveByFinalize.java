package com.qinhan.gc;
//用于演示对象复活的类
public class ReviveByFinalize {
	//含有自己的一个引用
	public static ReviveByFinalize caseForRevive;
	//重写finalize方法  只执行一次，存在隐患(复活时已经关闭资源或真正回收时没有关闭资源

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();//调用父类finalize,保证清理完全
		System.out.println("我正在复活");
		caseForRevive=this;//重新引用本对象。
		System.out.println("关闭资源");
	}
	
}
