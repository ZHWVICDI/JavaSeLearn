package com.qinhan.reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.qinhan.annotation.Length;

public class ReflectionTest {

	public static void main(String[] args)
			throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException,
			InvocationTargetException, NoSuchFieldException, IllegalAccessException, InstantiationException {
		// TODO Auto-generated method stub
		// 获取Class对象 3种方式
		Class<Dog> dogclass1 = Dog.class;//类名.class方式  推荐
		Dog dog = new Dog("hell", 12);
		Class<?> dogclass2= dog.getClass();//对象.getClass() 方式
		Class<?> dogclass3 = Class.forName("com.qinhan.reflectpratice.Dog");//Class.forName(全限定类名)

		System.out.println("获取Constructor构造器对象");
		// 获取指定构造器对象
		Constructor<Dog> constructor = Dog.class.getConstructor(String.class, Integer.class);
		// 通过构造器创建实例     与class对象调用newInstance不同 
		Dog dogForAnnotation = constructor.newInstance("hell",15);//注意参数！！！！这里与使用构造器时一致。
		System.out.println(dogForAnnotation + " " + dogForAnnotation.getName());
		// 遍历非private的构造器
		Constructor<Dog>[] constructorArr =(Constructor<Dog>[]) dogclass1.getConstructors();
		for (Constructor<Dog> c : constructorArr) {
			System.out.println(c + " " + c.getParameters());
		}
		
		System.out.println("获取Field属性对象");
		//获取指定名字的私有属性
		Field field1=dogclass1.getDeclaredField("age");
		setAccessible(field1);//注意获取非私有属性，必须要把属性访问权限设为true
		System.out.println("属性修饰符数量为:"+field1.getModifiers());
		//遍历所有属性
		Field[] fieldArr = dogclass1.getFields();
		for (Field field : fieldArr) {
			System.out.println(field + " " + field.getType());
		}
		
		System.out.println("获取Method方法对象");
		// 得到指定方法对象
		Method method = Dog.class.getMethod("getAge");
		System.out.println(method + " " + method.getReturnType());
		// 遍历所有的方法(不会获取被继承的方法)
		Method[] methodArr = dogclass1.getDeclaredMethods();
		for (Method m : methodArr) {
			if(!m.isAccessible()) {
				m.setAccessible(true);
			}
			System.out.println(m + " " + m.getName());
		}

		
		// 获取注解并处理
		// 获取属性对象即被注解属性(也可以是方法、类等)的类型
		Field nameF = Dog.class.getDeclaredField("name");
		Field ageF = Dog.class.getDeclaredField("age");
		setAccessible(nameF);
		setAccessible(ageF);
		// 通过属性对象获取 注解对象
		Length namelength = nameF.getDeclaredAnnotation(Length.class);
		Length ageLength = ageF.getDeclaredAnnotation(Length.class);
		System.out.println(ageLength.value() + " " + ageLength.words());
		System.out.println(namelength.value() + " " + namelength.words());
		// 取出被注解的属性(也可以是方法、类等)的值
		// int agevalue=(int)ageF.get(dogForAnnotation);
		String namevalue = (String) nameF.get(dogForAnnotation);
		// 判断值是否符合我们的注解的值，不符合。并作出相应的处理。例如@RequestMapping
		// 如果符合注解项，就跳转到这个bean的方法处理，否则抛出异常
		if (namevalue.equals(namelength.words())) {
			System.out.println("你的名字很好");
		} else {
			throw new IllegalAccessException("为什么你的名字不叫hell，而叫" + namevalue);
		}

		// 操作
		try {
			// 注意这里向下转型
			Dog newdog = (Dog)dogclass1.newInstance();//这里调用的是无参构造方法
			newdog.setAge(12);
			newdog.setName("ancy");
			System.out.println(dog);

			// private属性访问，不仅要使用*Declared*的方法，而且要更改为ture
			Field nameField = dogclass1.getDeclaredField("age");
			setAccessible(nameField);
			int age = (int) nameField.get(newdog);//获取指定对象的属性的值
			System.out.println("age:" + age);

			// 调用指定方法
			Method getNameMethod = dogclass1.getDeclaredMethod("getName");
			String name = (String) getNameMethod.invoke(newdog);//有参数，则是Class[]...
			System.out.println("名字" + name);

		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void setAccessible(Field fieldName) {
		if (!fieldName.isAccessible())
			fieldName.setAccessible(true);
	}

}

class Dog {
	@Length(value = 4, words = "hell")
	public String name;
	@Length()
	private Integer age;

	public Dog() {

	}

	public Dog(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	}
	
	private String say() {
		return "hello";
	}

}
