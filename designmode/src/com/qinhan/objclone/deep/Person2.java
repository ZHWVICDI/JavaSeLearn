package com.qinhan.objclone.deep;
//这里采用第二种方式:使用序列化和反序列化进行对象的深拷贝
public class Person2 extends DeepClone{
    private static final long serialVersionUID = 1L;
    private int age;
    private String name;
    private Address2 address2;

    public Person2(int age, String name, Address2 address) {
        this.age = age;
        this.name = name;
        this.address2 = address;
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address2 getAddress2() {
        return address2;
    }

    public void setAddress2(Address2 address) {
        this.address2 = address;
    }

    public String display() {
        return "Person [age=" + age + ", name=" + name + ", address=" + address2 + "]";
    }
}