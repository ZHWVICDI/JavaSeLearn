package com.zhw.second;

public class MutableString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String 的性能问题  频繁的新创建String所以，很消耗性能;
		String str="";
		for(int i=0;i<101;i++) {
			str+=i;
		}
		System.out.println(str);
		//创建StringBuilder		初始容量为16个字符
		StringBuilder sb=new StringBuilder();
		//append方法  注意与String调用方法时的区别 String不可变形，这里可变   链式编程    可接受各种数据类型
		sb.append('h'!='h').append('A').append(112d).append("hello");
		System.out.println(sb);
		//insert方法		插入同上内容到指定的位置
		StringBuilder sb2=new StringBuilder();
		sb2.append("helloworld!");
		sb2.insert(5," ");
		System.out.println(sb2);
		//delete方法		删除指定位置的子字符串，前包后不包
		sb2.delete(5, 11);
		System.out.println(sb2);
		//deleteCharAt方法		删除指定位置的字符
		sb2.deleteCharAt(5);
		System.out.println(sb2);
		//reverse方法			将字符串反转
		sb2.reverse();
		System.out.println(sb2);
		//capacity   返回当前容量,默认开始为16
		System.out.println(sb2.capacity());
		sb2.append("如果现在我们插入一些字符，然后容量为多少呢？");
		System.out.println(sb2.capacity());
		//charAr  	 返回指定索引位置的字符
		System.out.println("sb2.charAt(4):"+sb2.charAt(4));
		//getChars   复制指定范围的字符，然后存入一个char[](从4的索引位置开始)
		char[] chars=new char[10];
		sb2.getChars(0, 6, chars, 4);
		System.out.println(chars);
		
	}

}
