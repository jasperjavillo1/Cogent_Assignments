package com.microservicepractice.orderservice;

public class Order {
	private int id;
	private float price;
	private float payment;
	
	public Order() {}
	
	public Order(int id, float price, float payment)
	{
		this.id = id;
		this.price = price;
		this.payment = payment;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getPayment() {
		return payment;
	}
	public void setPayment(float payment) {
		this.payment = payment;
	}
	
	
}
