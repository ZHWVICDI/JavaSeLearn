package com.qinhan.practice3;

import java.util.Random;

/**
 * 提供
 * <ul>
 * <li>判断是否为空白</li>
 * <li>判断是否全为数字</li>
 * <li>判断是否为数字或字母</li>
 * <li>生成由大小字母数字组成随机的字符串</li>
 * </ul>
 * 
 * @author Administrator
 *
 */
public class StringUtil {

	/**
	 * 是否为空白 <code>
	 * "" => true
	 * "  "=> true
	 * "a" =>false
	 * null => true
	 * </code>
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isBlank(String str) {
		if (str == null) {
			return true;
		}
		if (str.length() == 0 || str.trim().length() == 0) {
			return true;
		}
		return false;
	}

	public static boolean isAllNum(String str) {
		return str.matches("[0-9]+");
	}

	public static boolean isALLNumOrA(String str) {
		return str.matches("[0-9a-zA-Z]+");
	}

	public static String randomStr(int length) {
		String val="";
		Random random = new Random();
		for (int i = 0; i < length; i++) {
			String charOrNum = (random.nextInt(2)) % 2 == 0 ? "char" : "num";
			if(charOrNum.equalsIgnoreCase("char")) {
				int temp=(random.nextInt(2))% 2 ==0 ? 65:97;
				val+=(char)(temp+random.nextInt(26));
			}else {
				val+=String.valueOf(random.nextInt(10));
			}
		}
		return val;
	}

	public static void main(String[] args) {
		String s = "we1d2)2";
		System.out.println(StringUtil.isALLNumOrA(s));
		String str=StringUtil.randomStr( 10);
		System.out.println(str);
	}

}
