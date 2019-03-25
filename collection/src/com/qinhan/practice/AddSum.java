package com.qinhan.practice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class AddSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Double> accountMap = new HashMap<>();
		accountMap.put("60002", 400.0);
		accountMap.put("60001", 300.0);
		accountMap.put("60003", 500.0);
		int sum=0;
		Collection<Double> valueD=accountMap.values();
		for(Double n:valueD) {
			sum+=n;
		}
		System.out.println("总值:"+sum);
		
	}

}
