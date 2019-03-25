package com.zhw.second;

public class ImmutableString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//探讨String的不可变性  及 原因 
		//字符串一旦创建都不可改变，任何修改都将生成一个新的String。
		//常量池：凡=直接赋值的方式得到的字符串，都存在常量池中。new创建的不适用常量池，而是都创建一个新的内存空间。
		String s1="hello";
		String s2="hello";
		//思考下结果并说出原因
		System.out.println("s1==s2:"+(s1==s2));
		
		String s3=new String("hello");
		String s4=new String("hello");
		System.out.println("s3==s4:"+(s3==s4));
		
		//探讨String的值传递
		String f="football";
		change(f);
		System.out.println("out1:"+f);
		
		change2(f);
		System.out.println("out2:"+f);
		
	}
	//这里我们同样值传递String，但是我们在方法内使用了replace方法，所以创建了一个新的对象(里面的引用指向该String对象),此时外面的引用和里面的引用分别指向不同的String对象。所以in为tootball 而out为football。
	private static String change2(String f) {
		// TODO Auto-generated method stub
		String inf=f.replace("f", "t");
		System.out.println("in2:"+inf);
		return inf;
		
	}
	//这里我们值传递 String  传的是引用,而我们在方法内创建一个引用，指向同一个String对象。所以in和out都是footbal
	private static String change(String s) {
		// TODO Auto-generated method stub
		String ins=s;
		System.out.println("in1 :"+ins);
		return s;
	}
	
	
	
}
