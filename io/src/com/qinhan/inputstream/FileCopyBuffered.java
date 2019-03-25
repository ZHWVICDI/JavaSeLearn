package com.qinhan.inputstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyBuffered {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		BufferedWriter bw = null;

		try {
			br = new BufferedReader(new FileReader("C:\\Users\\au\\Desktop\\新建文本文档.txt"));
			bw = new BufferedWriter(new FileWriter("C:\\Users\\au\\Desktop\\新建文本文档2.txt"));

			// 思考这里line的作用 原来的数组作为载体方式的区别
			String line = null;
			int lineNum=1;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				
				bw.write(lineNum+"\t"+line);
				lineNum++;
				bw.newLine();//请注意这里要添加一行
			}
			bw.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
				if (bw != null)
					bw.close();
				//思考这里的改进写法
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
