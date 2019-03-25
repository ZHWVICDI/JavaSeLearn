package com.qinhan.practice__;

public class RoastDuck {
	
	private double price;
	
	private double weight;

	private double cost;
	
	public double getProfit() {
		return price-cost;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "RoastDuck [price=" + price + ", weight=" + weight + ", cost=" + cost + "]";
	}
	
}
