package com.qinhan.dateapi;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建
			//创建当前时间
		LocalDateTime nowTime=LocalDateTime.now();
		System.out.println(nowTime);
		LocalDateTime l1=LocalDateTime.of(1999, 2, 28, 15, 23);
		System.out.println(l1);
		
		//更改   这里类似于Calendar的add方法。
		LocalDateTime t2=l1.plusYears(2);
		System.out.println(t2);
		LocalDateTime t3=t2.minusDays(3);
		System.out.println(t3);
			//这里这个更改复杂，上面那种简单些
		LocalDateTime nextDay=nowTime.plus(1,ChronoUnit.DAYS);
		LocalDateTime nextHour=nowTime.plus(1, ChronoUnit.HOURS);
		LocalDateTime nextMiu=nowTime.plus(1, ChronoUnit.MINUTES);
		System.out.println("nextDay:"+nextDay);
		System.out.println("nextHour:"+nextHour);
		System.out.println("nextMiu:"+nextMiu);
		
		
		//LocalDateTime<->Date(传统的)
		
		
		//访问   get/这个更贴近于生活
		System.out.println("年：" + nowTime.getYear() + " 月：" + nowTime.getMonth().getValue() + " 日：" + nowTime.getDayOfMonth());
		System.out.println("时：" + nowTime.getHour() + " 分：" + nowTime.getMinute() + " 秒：" + nowTime.getSecond());
		
		//String<=>LocalDateTime  
			//这个类专门用于格式化及解析  LocalDateTime可以使用来实现格式化
		DateTimeFormatter f=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
			//LocalDateTime->String
		String datetime=nowTime.format(f);
		System.out.println("LocalDateTime->String:"+datetime);
			//String->LocalDateTime
		LocalDateTime birth=LocalDateTime.parse("1997-01-25 00:00:00", f);
		System.out.println("String->LocalDateTime:"+birth);
		//区间处理  Period、Duration 
			//加上3年2月1日
		Period period=Period.of(3, 2, 1);
		LocalDateTime nextPeriond=nowTime.plus(period);
		System.out.println("nextPeriond:"+nextPeriond);
			//加上300秒
		Duration duration=Duration.ofSeconds(300);
		LocalDateTime nextDuration=nowTime.plus(duration);
		System.out.println("nextDuration:"+nextDuration);
	}

}
