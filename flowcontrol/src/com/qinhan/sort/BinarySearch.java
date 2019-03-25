package com.qinhan.sort;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//实现二分查找   前提：必须有序
		int[] a= {2, 4, 5, 6, 8, 23, 34, 34, 64};
		System.out.println("循环方式的二分查找:"+binarySearch(a,8));
		System.out.println("递归方式的二分查找:"+binarySearch(a,8,0,a.length-1));
	}
	//循环实现二分查找  返回索引值
	public static int binarySearch(int[] arr,int x) {
		int low=0;
		int high=arr.length-1;
		int middle=-1;
		while(low<=high) {
			middle=(low+high)/2;
			if(arr[middle]==x) {
				return middle;
			}else if(x<arr[middle]) {
				high=middle-1;
			}else {
				low=middle+1;
			}
		}
		return middle;	
	}
	//递归实现二分查找
	public static int binarySearch(int[] a,int target,int low,int high) {
		//首先防止数据出错
		if(low>high||target<a[low]||target>a[high]) {
			return -1;
		}
		int middle=(high+low)/2;
		if(a[middle]==target) {
			return middle;
		}else if(target<a[middle]) {
			return binarySearch(a,target,middle+1,high);
		}else {
			return binarySearch(a,target,low,middle-1);
		}
	}

}
