package com.qinhan.dateapi;

import java.util.Calendar;
import java.util.Date;

public class CalendarAPI {
	private static final long ONE_DAY = 24 * 60 * 60 * 1000L;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * long millis =new Date().getTime(); //创建实例 Calendar
		 * cal=Calendar.getInstance(); cal.setTime(new Date(millis+ONE_DAY)); //加减
		 * cal.add(Calendar.YEAR, 2); cal.add(Calendar.MONTH, -2); //获取
		 * System.out.println(cal.get(Calendar.YEAR));
		 * System.out.println(cal.get(Calendar.MONTH));
		 * System.out.println(cal.get(Calendar.DATE));
		 * System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		 * System.out.println(cal.getTime()); //设置 cal.set(Calendar.YEAR, 1998);
		 */
		// 获取一个Calendar的子类的实例
		Calendar c = Calendar.getInstance();
		// 获取年月日时分秒   get方法/Calendar的静态常量
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int day = c.get(Calendar.DAY_OF_MONTH);
		//int hour = c.get(Calendar.HOUR);
		int hour=c.get(Calendar.HOUR_OF_DAY);//24小时制
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		int weekday = c.get(Calendar.DAY_OF_WEEK)-1;// 星期 英语国家从星期日
		System.out.println("现在是" + year + "年" + month + "月" + day + "日" + hour + "时" + minute + "分" + second + "秒"
				+ "星期" + weekday);
		//设置上述值       实现跳转到一年后的今天  add方法
		c.add(Calendar.YEAR, 1);
		int oneyearpast=c.get(Calendar.YEAR);
		System.out.println("现在是" + oneyearpast + "年" + month + "月" + day + "日" + hour + "时" + minute + "分" + second + "秒"
				+ "星期" + weekday);
		
		//设置日期				set方法
		c.set(2008, 5, 12);
		int year2 = c.get(Calendar.YEAR);
		int month2 = c.get(Calendar.MONTH) + 1;
		int day2 = c.get(Calendar.DAY_OF_MONTH);
		System.out.println("现在是" + year2 + "年" + month2 + "月" + day2 + "日" + hour + "时" + minute + "分" + second + "秒"
				+ "星期" + weekday);
		
		//Calendar<==>Date
		Calendar cal=Calendar.getInstance();
		Date date=new Date();
			//Date=>Calendar
			cal.setTime(date);
			//Calendar=>Date
			Date d=cal.getTime();
		
		//获取任意一个月的最后一天
		int currenMonth=2;
		//这里设置为3月的第一天    要注意的是月份是从0开始算的，所以要加上1
		c.set(c.get(Calendar.YEAR), currenMonth,1);
		//c.set(2019, currenMonth,1);
		//然后我们将日期减一
		c.add(Calendar.DATE, -1);
		//这里我们获取到的就是2月的最后一天了
		int daytest=c.get(Calendar.DAY_OF_MONTH);
		System.out.println(c.get(Calendar.YEAR)+"年的"+(c.get(Calendar.MONTH)+1)+"月的最后一天是"+daytest);
	}

}
