package com.qinhan.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//演示Stream常见接口方法
public class StreamBase {
	//Stream可消费性
	//Stream的创建，一般调用对应的工具方法of
	public static void main(String[] args) {
		Stream<String> stream=Stream.of("I","Love","you","too");
		List<String> sl1=new ArrayList<>();
		sl1.add("I");
		sl1.add("love");
		sl1.add("tyq");
		Stream<List<String>> streamList=Stream.of(sl1);
		streamList.forEach(x->x.forEach(y->System.out.println(y)));
		//forEach()迭代   结束操作
		stream.forEach(x->System.out.println(x));
		
		//filter   返回一个只包含满足条件元素的stream     
		//这些操作我们都不会去记名字，因为都是用的函数式编程
		Stream<String> stream2=Stream.of("I","Love","you","too");
		System.out.println("==filter==");
		stream2.filter(str->str.length()==3)
			.forEach(x->System.out.println(x));
		
		//distinct   返回去除重复元素之后的stream
		Stream<String> stream3=Stream.of("I","Love","you","too","too");
		System.out.println("==distinct==");
		stream3.distinct()
				.forEach(x->System.out.println(x));
		
		//sorted   使用自然顺序和使用自定义比较器排序
		Stream<String> stream4=Stream.of("I","Love","you","too");
		System.out.println("==sorted==");
		//stream4.sorted().forEach(x->System.out.println(x));
		stream4.sorted((str1,str2)->str1.length()-str2.length())
				.forEach(x->System.out.println(x));
		
		//map   返回一个对当前所有元素执行mapper之后的结果组成的stream  转换前后元素个数不会变，但元素类型取决于转换之后的类型
		Stream<String> stream5=Stream.of("I","Love","you","too");
		System.out.println("==map==");
		stream5.map(x->x.toUpperCase())
				.forEach(x->System.out.println(x));
		
		//flatMap  返回stream中元素组成新的stream作为最终返回结果.简单来说就是把原stream所有元素"摊平"之后组成stream，前后元素个数和类型都可能改变。
		//注意后面的参数与stream指定的泛型相关  注意这里泛型的指定
		//注意不要导错包
		Stream<List<Integer>> stream6=Stream.of(Arrays.asList(1,2),Arrays.asList(3,4,5));
		System.out.println("==flatMap==");
		stream6.flatMap(list->list.stream())
				.forEach(x->System.out.println(x));
	}	
}
