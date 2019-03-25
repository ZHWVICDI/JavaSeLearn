package com.qinhan.dateapi;

import java.util.Date;

public class DateAPI {
private static final long ONE_DAY = 1*24*60*60*1000;

	//Date方法有很多都已经弃用了,剩下的主要是与long《=》Date互相转换
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//默认创建为当前时间点的日期
		Date now=new Date();
		System.out.println(now);
		//long->Date 
		Date date1=new Date(0L);//oL表示从1970-01-01 00:00的毫秒值
		System.out.println(date1);
		//Date->long
		long time=date1.getTime();//获取到至今的毫秒值
		System.out.println(time);
		//基于long值的日期运算 加一天 等价 1*24*60*60*1000  （此乃精髓，什么都转为long型然后进行计算，啊哈哈）
		date1.setTime(time+ONE_DAY);//注意，这里将当前日期+上一天了
		System.out.println(date1);
		//日期比较
		System.out.println(date1.before(now));
		System.out.println(date1.after(now));
		System.out.println(date1.compareTo(now));
	}

}
