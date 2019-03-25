package com.qinhan.objclone.deep;

public class Address2 extends DeepClone{
    private String province;
    private String street;

    public Address2(String province, String street) {
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
    
	
}