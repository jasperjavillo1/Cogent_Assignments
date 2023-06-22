package com.cogent.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component

public class Employee {
	int id;
	String name;
	@Autowired
	Address address;
	public Employee()
	{
		System.out.println("Employee default constructor");
	}
	@Autowired
	public Employee(Address address) {
		super();
		System.out.println("Employee(Address) constructor");
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	@Autowired
	public void setAddress(Address address) {
		System.out.println("Employee.setAddress() run");
		this.address = address;
	}
	@PostConstruct
	public void predest()
	{
		System.out.println("Bean created");
	}
	@PreDestroy
	public void postdest()
	{
		System.out.println("Bean destroyed");
	}
}
