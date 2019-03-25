package com.qinhan.BeanIntrospector;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;

//演示内省机制，spring框架等经常使用
public class BeanIntrospector {

	public static void main(String[] args) throws IntrospectionException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		//Introspector获取BeanInfo对象
		BeanInfo employeeBeanInfo=Introspector.getBeanInfo(Employee.class);
		PropertyDescriptor[] propsDes=employeeBeanInfo.getPropertyDescriptors();
		//迭代所有的属性对象，使用set方法对name和salary赋值
		for(PropertyDescriptor prop:propsDes) {
			if(prop.getName().equals("name")) {
				//返回该属性对象的写入方法即setter方法并动态调用
				prop.getWriteMethod().invoke(emp, "tyq");
				//返回属性对象的getter方法并动态调用。
				System.out.println(prop.getReadMethod().invoke(emp));
			}
			if(prop.getName().equals("salary")) {
				prop.getWriteMethod().invoke(emp, new Integer(10000));
				System.out.println(prop.getReadMethod().invoke(emp));
			}
		}
	}
}
