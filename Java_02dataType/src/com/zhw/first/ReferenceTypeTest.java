package com.zhw.first;

public class ReferenceTypeTest {

		public static void main(String[] args) {
			String name = new String("hello");
			System.out.println(name.length());
			int[] data = new int[]{1,3,5,7,9};
			
			Rocket bigRocket = new Rocket();
			bigRocket.biu();
			
			Rocket fakeRocket = null;
			System.out.println(fakeRocket);
			String str1 = null;
			System.out.println(str1);
			String str2 = "";
			
			
			Beer qingdaoBeer = new Beer("青岛",20.0);
			Beer snowBeer = new Beer("雪花",20.0);
			Beer qingdaoBeer2 = new Beer("青岛2",20.0);
			
			System.out.println(qingdaoBeer==snowBeer);
			
			Beer qingdaoBeer3 = qingdaoBeer;
			System.out.println(qingdaoBeer3==qingdaoBeer);

			System.out.println(qingdaoBeer==qingdaoBeer2);
			System.out.println(qingdaoBeer.equals(qingdaoBeer2));

		}
}
