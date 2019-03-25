package com.qihan.create.builder;

public class Client {
//client    
	//客户创建Director对象  --这里是RTFReader    并使用想要的Builder对象进行配置
	//一旦产品部件被生成，director通知生成器
	//生成器处理director请求，并将部件添加到产品中
	//客户从生成器检索产品
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Text t=new Text();
			ASCIIConverter ac=new ASCIIConverter();
			RTFReader r=new RTFReader(ac);
			r.parseRTF(t);
			ac.GetASCIIText();
	}
	//总结:builder 与 abstractfactory模式的区别   
	//builder着重于一步步构建一个复杂的对象，而abstractfactory着重于多个系列的产品

}
