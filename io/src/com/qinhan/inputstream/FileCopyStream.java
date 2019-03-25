package com.qinhan.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileCopyStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// C:\Users\au\Desktop\新建文本文档.txt
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("C:\\Users\\au\\Desktop\\新建文本文档.txt");
			// 考虑是否存在，存在考虑append
			fos = new FileOutputStream("C:\\Users\\au\\Desktop\\新建文本文档2.txt");
			byte[] buf = new byte[1024];// 缓冲数据
			while (fis.read(buf) != -1) {
				//思考两个buf在分别的流中的作用
					//buf在上面作为存放读入数据的载体 ，在下面作为存放写入数据的载体。
				//再次思考，在输入流中时，buf中的数据不处理会怎么样。   提示，将buf改为10看看，输出结果是怎么样。
					//下次再调用read  byte数组中的之前的数据会被覆盖掉
				//再再次思考， 请看read的3中重载方法，分别的作用。
					//read() 读下一个字节  read(byte[] b) 读一定数量的字节到byte数组  read(byte[] b,int off, int len) 最多len个字节读入byte数组
				fos.write(buf);
				System.out.println(Arrays.toString(buf));
			}
			fos.flush();// 防止有残留，强制缓冲写入文件中。
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
				if (fos != null)
					fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
