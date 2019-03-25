package com.qinhan.exception;

public class FinallyReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
////		发生了异常并且被捕获
//		try{
//			int x=100;
//			int y=0;
//			System.out.println("x/y="+x/y);
//			System.out.println("x/y计算结束");
//		}catch(ArithmeticException e){
//			System.out.println("发生了数学异常，注意除数不能为0.");
//			return;
//		}finally{
//			System.out.println("finally代码块");
//		}
//		System.out.println("main方法运行结束");
//		}
		//  发生了异常并且被捕获
		try{
		int x=100;
		int y=0;
		System.out.println("x/y="+x/y);
		System.out.println("x/y计算结束");
		}catch(ArithmeticException e){
		System.out.println("发生了数学异常，注意除数不能为0.");
		System.exit(0);
		//这里并没有执行finally块
		}finally{
		System.out.println("finally代码块");
		}
		System.out.println("main方法运行结束");
	}

	

}
