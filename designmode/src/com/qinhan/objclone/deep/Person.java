package com.qinhan.objclone.deep;
//这里采用第一种方式:通过给需要拷贝的引用类型也实现Cloneable接口并覆写clone方法   这里手动实现person引用类型address属性的clone。
public class Person implements Cloneable {
    private int age;
    private String name;
    private Address address;

    public Person(int age, String name, Address address) {
        this.age = age;
        this.name = name;
        this.address = address;
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person person=(Person)super.clone();
        //手动对Address属性进行clone,然后赋给address属性
        person.address=(Address)address.clone();
        return person;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String display() {
        return "Person [age=" + age + ", name=" + name + ", address=" + address + "]";
    }
}