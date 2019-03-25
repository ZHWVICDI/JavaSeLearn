package com.qinhan.dateapi;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.sun.xml.internal.messaging.saaj.packaging.mime.internet.ParseException;

//格式化与解析日期 String<==>Date
public class SimpleDateFormatAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//pattern字符串  传入 构建一个SimpleDateFormat实例
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
		Date someDate=Calendar.getInstance().getTime();
		//Date->String
		String formatted=sdf.format(someDate);
		System.out.println(formatted);
		Date parsedDate = null;
		try {
			//这里必须要满足sdf传入的模板字符串的格式
			//String->Date
			parsedDate = sdf.parse("2008-05-12 14:28:12.123");
		} catch (java.text.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(parsedDate);
	}

}
