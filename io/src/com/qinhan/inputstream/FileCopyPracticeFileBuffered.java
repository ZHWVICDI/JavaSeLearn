package com.qinhan.inputstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//这里主要演示try-with-source语法糖的用法。
//外部资源的句柄对象的创建放在try()中，那么java会自动帮你关闭相关的资源。
public class FileCopyPracticeFileBuffered {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\au\\Desktop\\新建文本文档.txt"));BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\au\\Desktop\\新建文本文档2.txt"))){
			String line=null;
			while((line=br.readLine())!=null) {
				System.out.println(line);
				
				bw.write(line);
				bw.newLine();
			}
			bw.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
