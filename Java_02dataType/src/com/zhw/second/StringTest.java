package com.zhw.second;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringTest {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		//创建字符串
		 	//1.字面量   //凡是用=赋值的字符串都存入常量池中。
		String iteralStr="hello,string";
		System.out.println(iteralStr);
		  	//2.构造器
		String consStr=new String("hello,String");
		System.out.println(consStr);
			//3.valueOf静态方法    将基本类型转换为字符串   （在包装器类中，valueOf是将对应的基本数据类型转换为该包装器类型)
		String statStr=String.valueOf(true);
		System.out.println(statStr);
		
		char[] data= {'h','e','l','l','o'};
		String statStr2=String.valueOf(data);
		System.out.println(statStr2);
		
		//常用操作
			//修改内容(增删替换)
				//concat	拼接字符串
		String concatStr=new String("hello,String");
		String str=",you";
		System.out.println("concatStr.concat(str):"+concatStr.concat(str));
		System.out.println("12+12+\"\"+12:"+12+12+""+12);
				//matches  正则表达式匹配  注意这里是完全匹配
		String regexStr="10999";
		System.out.println("regexStr.matches(\"\\\\d{5}\":"+regexStr.matches("\\d{5}"));
				//replace   将所有指定子字符串替换为指定字符串
		String replaceStr="1000 1000 10000";
		System.out.println("replaceStr.replace(\"1000\", \"zhw\":"+replaceStr.replace("1000", "zhw"));
				//replaceAll	将所有匹配正则表达式的字符串替换为指定字符串
		String replaceAllStr="1999 年 12月 31日";
		System.out.println(""+replaceAllStr.replaceAll("\\d{4}|\\d{2}", "某"));
				//replaceFirst  将匹配正则表达式的第一个字符串替换为指定字符串
		System.out.println("replaceAllStr.replaceFirst(\"\\\\d{4}|\\\\d{2}\", \"某\":"+replaceAllStr.replaceFirst("\\d{4}|\\d{2}", "某"));
				//split		通过分隔符(正则表达式)将字符串分隔为string[]
		String splitStr="小明,小红,小李";
		System.out.println("Arrays.toString(splitStr.split(\",\")):"+Arrays.toString(splitStr.split(",")));
		String[] persons=splitStr.split(",");
		System.out.println("persons.length:"+persons.length);
				//subString
		String rowStr="hello,you hao ";
		System.out.println("rowStr的子字符串为："+rowStr.substring(6, 8));
				//trim
			//查询
		System.out.println("========查询========");
		String qStr=new String("this is for query test");
				//查询子字符串是否包含hello  contains
		System.out.println(consStr.contains("hello"));
				//查询子字符串是否以you结尾	  endsWith
		System.out.println(consStr.endsWith("you"));
				//返回索引处的char值		charAt
			System.out.println("qStr.charAt(0):"+qStr.charAt(0));
				//返回指定字符或字符串的索引    indexOf
			String indexOfStr="hello,world!";
			System.out.println("indexOfStr.indexOf('o'):"+indexOfStr.indexOf('o'));
			System.out.println("indexOfStr.indexOf(\"lo\"):"+indexOfStr.indexOf("lo"));
				//isEmpty  判断字符串是否为空
			String emptyStr="";
			System.out.println("emptyStr.isEmpty():"+emptyStr.isEmpty());
				//lastIndexOf	得到最后匹配字符串的开始的索引
			String lastIndexOf="hello,world!";
			System.out.println("lastIndexOf.lastIndexOf(\",\"):"+lastIndexOf.lastIndexOf(","));
				//subString 截取子串，前包后不包
			String  subStringStr="hello,zhw tyq";
			System.out.println("subStringStr.substring(6):"+subStringStr.substring(6));
			//比较
		System.out.println("========比较========");
		String compStr1=new String("hello");
		String compStr2=new String("hello");
		System.out.println("compStr1==compStr2:"+(compStr1==compStr2));
		System.out.println("compStr1.equals(compStr2):"+compStr1.equals(compStr2));
				//比较内容  忽略大小写 比 较  equalsIgnoreCase
		String ignoreStr="zhW";
		System.out.println("ignoreStr.equalsIgnoreCase(\"zhw\"):"+ignoreStr.equalsIgnoreCase("zhw"));
				//compareTo 比较字典顺序
			//打印输出
				//format方法      模板字符串替换为后面参数，然后打印
		String formatStr="%s 在吃饭吗？";
		System.out.println(formatStr.format(formatStr, "小红"));
			//转换大小写
				//toLowerCase
		String lowStr="zhw";
		String upperStr="ZHW";
		System.out.println("lowStr.toUpperCase():"+lowStr.toUpperCase());
		System.out.println("upperStr.toLowerCase():"+upperStr.toLowerCase());
				//toUpperCase
			//类型转换
				//char[] => String	valueOf
		char[] data2= {'亲','爱','的','祖','国'};
		String convStr=String.valueOf(data2);
		System.out.println("convStr "+convStr);
				//String=>char[]	toCharArray
		char[] data3=convStr.toCharArray();
		System.out.println("Arrays.toString(data3) "+Arrays.toString(data3));
				//String=>byte[]     getBytes  可指定编码
		String strStr="hello,world!";
		byte[] bytes=strStr.getBytes("utf-8");
		System.out.println(Arrays.toString(bytes));
				//byte[]=> String   构造器    transcoding
		String byteStr=new String(bytes,"utf-8");
		System.out.println(byteStr);
				//valueOf 可接受所有的基本数据类型，以及引用类型，返回字符串表示形式
	}	

}
