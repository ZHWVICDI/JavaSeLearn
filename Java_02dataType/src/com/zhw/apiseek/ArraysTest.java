package com.zhw.apiseek;

import java.util.Arrays;
import java.util.List;

public class ArraysTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numA= {1,2,3,4,5,234,234,2,34,234};
		//asList 	将一个数组转换为列表  注意这里泛型的类型为int[],而不是int
		List<int[]> numL=Arrays.asList(numA);
		//binarySearch   二分查找相应数组的某个值,返回值为值在数组中索引
		System.out.println(numA[Arrays.binarySearch(numA, 34)]);
		//copyOf 	复制指定的数组,这个过程可能截取，或填充(根据重新指定的长度)
		System.out.println("numA数组内容为:"+Arrays.toString(numA));
		int[] copyedNum=Arrays.copyOf(numA, 3);
		System.out.println("Arrays.copyOf"+Arrays.toString(copyedNum));
		//copyOfRange  指定数组的指定范围拷贝到一个新数组,前包后不包
		int[] copyedNum2=Arrays.copyOfRange(numA, 4, 6);
		System.out.println("Arrays.copyOfRange"+Arrays.toString(copyedNum2));
		//deepEquals  比较两个数组是否是深层相等的 为多维数组设计
		int[][] multiN1= {{1,2,3},{4,5,6}};
		int[][] multiN2= {{1,2,3},{4,5,6}};
		System.out.println(Arrays.equals(multiN1, multiN2));
		System.out.println(Arrays.deepEquals(multiN1, multiN2));
		//,,,,
		//deepToString   返回指定数组“深层内容”的字符串表示形式,这个专为多维数组设计
		int[][] multiNum= {{1,23,3},{23,45,6}};
		System.out.println(Arrays.toString(multiNum));
		System.out.println(Arrays.deepToString(multiNum));
		//equals 	比较两个数组是否相等  这里请注意 数组复制的问题   解决：copyOf方法来解决引用赋值的问题。
		int[] src= {1,2,4};
		int[] tempsrc= src;
		src[0]=3;
		System.out.println(Arrays.toString(tempsrc));
		System.out.println(Arrays.toString(src));
		System.out.println("Arrays.equals(src, tempsrc):"+Arrays.equals(src, tempsrc));
		//fill  将指定值分配给指定数组的每个元素
		char[] chars=new char[10];
		Arrays.fill(chars, 'Z');
		Arrays.fill(chars,1,10,'T');
		System.out.println(Arrays.toString(chars));
		
		//sort   对指定数组按升序排序。基本数组类型都可以，以及引用类型
		char[] chars2= {'d','e','c','a'};
		Arrays.sort(chars2);
		System.out.println(chars2);
	}

}
