package com.cogent.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource(value = { "classpath:app.properties" })
public class AppConfiguration {
	/*
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
	*/
}
