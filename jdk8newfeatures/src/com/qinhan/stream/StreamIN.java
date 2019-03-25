package com.qinhan.stream;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//演示流的规约操作   主要是reduce 和 collect方法
//reduce  将所有元素汇总为一个结果
//collect  将所有元素转换为一个列表或集合
public class StreamIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//reduce操作： sum max min count 都是reduce操作 但因为常用所以单独列出
		
		//从一组单词中找出最长的单词
		System.out.println("从一组单词中找出最长的单词:");
		Stream<String> stream=Stream.of("I","Love","you","too");
		//这里的Optional是(一个值)的容器，可以避免null值的麻烦。
		//这里的lamada表达式 用于表示  选取的条件
		Optional<String> longest=stream.reduce((s1,s2)->s1.length()>=s2.length()? s1:s2);
		System.out.println(longest.get());
		
		//求一组单词长度之和
		System.out.println("一组单词长度之和:");
		Stream<String> stream2=Stream.of("I","Love","you","too");
		Integer lengthSum=stream2.reduce(0,//指定初始值
				(sum,str)->sum+str.length(),//累加器  总和  当前值
				(a,b)->a+b);   //部分和拼接器 ，并行执行时会用到
		System.out.println(lengthSum);
		
		//collect操作  终极武器 用于将Stream生成一个集合或Map复杂对象。
		
		//将Stream转换为容器或Map
		System.out.println("将Stream转换为容器或Map");
		Stream<String> stream3=Stream.of("I","Love","you","too");
		//List<String> list=stream3.collect(Collectors.toList());
		//Set<String> set=stream3.collect(Collectors.toSet());
		//Function.identity()  接口的静态方法  返回输入输出的Lambda对象等价于t->t形式的Lambda表达式
		//string::length  方法引用   替代某些特定的Lambda表达式
			//Integer::sum  引用静态方法
			//list::add     引用某个对象的方法
			//String::length 引用某个类的方法
			//HashMap::new  引用构造方法
		//将stram规约为map  指定key value生成方式
		Map<String,Integer> map=stream3.collect(Collectors.toMap(Function.identity(), String::length));
		System.out.println(map);
		
		//Collector  收集器  指定 1. 目标容器是什么 2.元素如何添加到容器 如果进行并行的规约还需要3.多个部分结果如何合并为一个。
		//Collectors工具提供各种对应的收集器来转换
		//将Stream规约为List
		Stream<String> stream4=Stream.of("I", "love", "you", "too");
		System.out.println("==规约==");
		//方式一
		List<String> list=stream4.collect(ArrayList::new,ArrayList::add,ArrayList::addAll);
		//方式二
		//List<String> list2=stream4.collect(Collectors.toList());
		System.out.println(list);
		
		//使用collect生成Collection 
		//上述使用collectors的工具提供收集器，但是返回结果是接口类型，并不知道类库实际选择的容器类型
		//如果我们要人为指定容器的实际类型可通过
		//Collectors.toCollection(Supplier<C> collectionFactory)完成
		Stream streamss=Stream.of("I","Love","You","!");
		//ArrayList<String> arrayList=(ArrayList<String>) streamss.collect(Collectors.toCollection(ArrayList::new));
		//arrayList.forEach(x->System.out.println(x));
		HashSet<String> hashSet=(HashSet<String>) streamss.collect(Collectors.toCollection(HashSet::new));
		
		//演示如何将学生列表转换为<学生，GPA>组成的map
		
	}

}
