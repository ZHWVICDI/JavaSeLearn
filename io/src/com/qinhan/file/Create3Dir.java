package com.qinhan.file;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Create3Dir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File predir=new File("D:\\ChinaSoft_Software\\java1901\\张瀚文");
		//创建日志、作业、练习目录下的文件  日志\\*.md  作业\\*  练习\\*
		//创建yyyy年mm月dd日格式的字符串
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy年MM月dd日");
		String date=simpleDateFormat.format(new Date());
		System.out.println(date);
		
		File homework=new File(predir,"作业\\"+date);
		homework.mkdir();
		File practice=new File(predir,"练习\\"+date);
		practice.mkdir();
		File rizhi=new File(predir,"日志\\"+date+".md");
		try {
			rizhi.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
