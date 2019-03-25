package com.qinhan.practice4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Set;
import java.util.TreeSet;

public class SortedUser {

	public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException {
		Set<Worker> set=new TreeSet<>();
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(new FileInputStream("D:\\ChinaSoft_Software\\java1901\\张瀚文\\作业\\2019年03月19日\\data.txt"), "UTF-8");
		BufferedReader br=null;
		try{
			br=new BufferedReader(isr);
			String line=null;
			while((line=br.readLine())!=null) {
				//通过字符串  得到一个Worker对象并加入到set中
				Worker w=getWorker(line);
				set.add(w);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(br!=null) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		System.out.println(set);
	}
	
	public static Worker getWorker(String s) {
		//拆分字符串
		String[] attrs=s.split("#");
		Worker w=new Worker();
		w.setName(attrs[0]);
		w.setAge(Integer.valueOf(attrs[1]));
		w.setType(attrs[2]);
		return w;
	}

}
