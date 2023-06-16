package com.cogent.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
	@Bean
	public Employee getEmployee()
	{
		return new Employee();
	}
	@Bean
	public Address getAddress()
	{
		return new Address();
	}
}
