package com.qinhan.objclone.deep;

public class AppDeep2 {
/**
 * 深复制测试    这里采用序列化--反序列化方式
 * 深拷贝：创建一个新对象，然后将当前对象的非静态字段复制到该对象，
 * 如果字段类型是值类型（基本类型）的，那么对该字段进行复制；
 * 如果字段是引用类型的，引用类型的属性内容也拷贝一份新的。
 * 此时新对象里面的引用类型字段相当于是原始对象里面引用类型字段的一个副本，原始对象与新对象里面的引用字段指向的是同一个对象。
 * @param args  main方法参数
 * @throws Exception 
 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//创建一个包含可变引用属性的Person对象作为我们要复制的对象   但是这个引用属性类型已经实现cloneable接口，并在person类的clone方法中调用。
			Person2 person2=new Person2(15,"zhang",new Address2("四川","天府二街"));
			
			//这里使用实现的clone方法来复制本身
			Person2 clonePerson2=(Person2) person2.deepClone();
			
			//打印被复制的对象和clone对象 这里是打印的是地址。
			System.out.println("person2="+person2);
			System.out.println("clonePerson="+clonePerson2);
			System.out.println("这里的地址是不同的，表示clone对象和原对象是两个不同的对象");
			//打印被复制的对象和clone对象 这里是值
			System.out.println("person2="+person2.display());
			System.out.println("clonePerson="+clonePerson2.display());
			
			
			System.out.println("========================================================================================");
			//然后我们进行重设值，将clone对象的基本属性以及String类型属性以及Address类型属性更改，查看是否对原对象有影响
			System.out.println("然后我们进行重设值，将clone对象的基本属性以及String类型属性以及Address类型属性更改，查看是否对原对象有影响");
			clonePerson2.setName("li");
			clonePerson2.setAge(22);
			Address2 address2=clonePerson2.getAddress2();
			address2.setStreet("天府四街");
			//查看重设值后 clone对象和原对象的更改，如果原对象的引用属性也更改，就表示是浅复制，如果原对象没有改变，就表示是深复制。
			System.out.println("person2="+person2.display());
			System.out.println("clonePerson2="+clonePerson2.display());
			System.out.println("仔细查看这四次，发现原对象Person2的引用属性并没有更改，表示是深复制");
	}

}
