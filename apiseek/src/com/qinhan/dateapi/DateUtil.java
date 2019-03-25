package com.qinhan.dateapi;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	//常见的时间的字符串
	private static final String DEFAULT_PATTERN = "yyyy-MM-dd HH:mm:ss";
	private static final String LONG_PATTERN = "yyyyMMddHHmmssSSS";
	//getxxx  获取不同的日期对象
	
	public static Date getDate() {
		return new Date();
	}
	
	public static Calendar getCalendar() {
		return Calendar.getInstance();
	}
	
	public static LocalDateTime getLocalDateTime() {
		return LocalDateTime.now();
	}
	
	//字符串和各种日期对象的互转
	/**
	 * 字符串转换为Date对象  通过SimpleDateFormat
	 * @param dateStr
	 * @param simpleDateFormat
	 * @return Date对象
	 */
	public static Date str2Date(String dateStr,SimpleDateFormat simpleDateFormat) {
		if(dateStr==null||dateStr=="") {
			return null;
		}
		Date date =null;
		try {
			date=simpleDateFormat.parse(dateStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * 将Date对象转换为字符串   通过SimpleDateFormat
	 * @param date
	 * @param simpleDateFormat
	 * @return	String 字符串
	 */
	public static String date2Str(Date date,SimpleDateFormat simpleDateFormat) {
		if(date==null) {
			return null;
		}
		return simpleDateFormat.format(date);
	}
	
	/**
	 * 字符串 转换为 LocalDateTime对象
	 * @param dateStr
	 * @param dateTimeFormatter
	 * @return LocalDateTime对象
	 */
	public static LocalDateTime str2LDT(String dateStr,DateTimeFormatter dateTimeFormatter) {
		if(dateStr==null||dateStr=="") {
			return null;
		}
		LocalDateTime localDateTime=null;
		localDateTime=LocalDateTime.parse(dateStr, dateTimeFormatter);
		return localDateTime;
	}
	/**
	 * LocalDateTime对象转换为字符串
	 * @param l
	 * @param d
	 * @return  String字符串
	 */
	public static String  ldt2Str(LocalDateTime l,DateTimeFormatter d) {
		return l.format(d);
	}
	
	//获取当前日期的字符串
	
	//getMillis 通过各种方式获取long表示的millis
	/**
	 * 获取当前系统时间的毫秒数
	 * @return  long型的毫秒数
	 */
	public static long getMillis() {
		return new Date().getTime();
	}
	/**
	 * 获取指定日历的毫秒数
	 * @param calendar
	 * @return	long型的毫秒数
	 */
	public static long getMillis(Calendar calendar) {
		return calendar.getTime().getTime();
	}
	/**
	 * 获得指定日期的毫秒数
	 * @param date
	 * @return long型的毫秒数
	 */
	public static long getMillis(Date date) {
		return date.getTime();
	}
	
	//将Date->String
	public static String format(Date date,String pattern) {
		return simpleFormat(pattern).format(date);
	}
	//被格式化
	public static DateFormat simpleFormat(String pattern) {
		return new SimpleDateFormat(pattern);
	}
}
