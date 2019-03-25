package com.qinhan.objclone.deep;
//需要将Person类的引用属性Address也实现 Cloneable接口
public class Address implements Cloneable{
    private String province;
    private String street;

    public Address(String province, String street) {
        this.province = province;
        this.street = street;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String display() {
        return "Address [province=" + province + ", street=" + street + "]";
    }

	@Override
	public String toString() {
		return "Address [province=" + province + ", street=" + street + "]";
	}
	//这里的clone方法，是对Address的自身的克隆
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
    
	
}