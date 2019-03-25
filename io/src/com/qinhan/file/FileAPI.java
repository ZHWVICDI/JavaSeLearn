package com.qinhan.file;

import java.io.File;
import java.io.IOException;

public class FileAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建一个File对象
		File file = new File("C:\\Users\\au\\Desktop\\temp\\a.txt");
		System.out.println(file);
		System.out.println("file.exists():" + file.exists());
		// 创建文件  ---这里演示当我们也不知道前面目录是否存在时
		if(!file.exists()) {
			String filestr=file.toString();
			String filedir=filestr.substring(0,filestr.lastIndexOf("\\"));
			File dir=new File(filedir);
			dir.mkdirs();
		}
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 判断是否为文件或目录
		System.out.println("file.isDirectory():" + file.isDirectory());
		System.out.println("file.isFile():" + file.isFile());
		// 更名到另一个
		file.renameTo(new File("C:\\Users\\au\\Desktop\\temp\\b.txt"));

		// 列出文件
		File dir = new File("C:\\Users\\au\\Desktop\\temp");
		File[] files = dir.listFiles();
		System.out.println(files);

		// 创建目录
		File newDir = new File("C:\\Users\\au\\Desktop\\temp2");
		if (!newDir.exists()) {
			newDir.mkdir();
		}
		// 创建多重目录
		File newDir2 = new File("C:\\Users\\au\\Desktop\\temp2\\a\\b\\c");
		if (!newDir2.exists()) {
			newDir2.mkdirs();
		}

		// File的字段
		System.out.println(File.pathSeparator);// 路径分隔符
		System.out.println(File.separator);// 文件分隔符
		
		//是否可读可写可执行
		System.out.println("文件是否可执行："+file.canExecute());
		System.out.println("文件是否可读"+file.canRead());
		System.out.println("文件是否可写:"+file.canWrite());
	}

}
