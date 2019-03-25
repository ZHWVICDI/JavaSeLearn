package com.qihan.create.builder.entity;

public class CPU {
	private String brand;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "CPU [brand=" + brand + "]";
	}
	
}
