package com.qinhan.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FileCopyChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// C:\Users\au\Desktop\新建文本文档.txt
		FileReader reader = null;
		FileWriter writer = null;
		try {
			reader = new FileReader("C:\\Users\\au\\Desktop\\新建文本文档.txt");
			// 考虑是否存在，存在考虑append
			writer = new FileWriter("C:\\Users\\au\\Desktop\\新建文本文档2.txt");
			char[] cbuf = new char[1024];// 缓冲数据  这里最好是2的次幂
			int len=0;
			while ((len=reader.read(cbuf)) != -1) {
				//这里思考   这里有个坑哦！这里调用的方法等价于write(cbuf,0,cbuf.length())
				writer.write(cbuf,0,len);
				//这里思考  乱码的问题 
				System.out.println(Arrays.toString(cbuf));
			}
			writer.flush();// 防止有残留，强制缓冲写入文件中。
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (reader != null)
					reader.close();
				if (writer != null)
					writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
