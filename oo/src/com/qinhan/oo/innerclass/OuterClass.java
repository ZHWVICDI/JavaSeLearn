package com.qinhan.oo.innerclass;

public class OuterClass {
	private String outername;
	private int outerage;
	private static String staticstring;
	private int i=10;
	//成员内部类
	//可访问外部类的所有成员方法和属性
	class InnerClass{
		private int i=100;
		public InnerClass() {
			staticstring="hello";
			outername="zhw";
			outerage=21;
		}
		public void dispaly() {
			//this.i  在内部类中直接使用this，指代内部类自身引用
			System.out.println("this.i:"+this.i);
			//OuterClass.this.i  引用外部类类名.this 指代外部类对象引用
			System.out.println("OuterClass.this.i:"+OuterClass.this.i);
			System.out.println(outername+outerage);
		}
	}
	
	public void display() {
		System.out.println("outer:"+outername+outerage);
	}
	public void display(int arg) {
		//局部内部类
		class InnerClass2{
			public InnerClass2() {
				outername="zhw局部";
				outerage=arg;
			}
			public void display() {
				System.out.println("局部内部类:"+outerage+outername);
			}
		}
		InnerClass2 ic=new InnerClass2();
		ic.display();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建成员内部类实例
		//注意构建成员内部类的形式
		  //1.首先构建外部类对象
		  //2.以外部类.内部类的形式进行声明
		  //3.以外部类对象.new 内部类构造方法()的方式构建对象
		OuterClass outerclass=new OuterClass();
		outerclass.display();
		OuterClass.InnerClass innnerClass=outerclass.new InnerClass();
		//请思考为什么这里外部类属性被赋值
		innnerClass.dispaly();
		outerclass.display();
		//请思考这里为什么外部类属性又被改变
		outerclass.display(22);
		outerclass.display();
	}

}
