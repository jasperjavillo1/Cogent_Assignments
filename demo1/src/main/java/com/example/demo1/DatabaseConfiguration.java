package com.example.demo1;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "default")
@Component
public class DatabaseConfiguration {
	private String url;
	private String username;
	private String password;
	private String driver;
	
	public String getUrl() {
		System.out.println(url);
		return url;
	}
	public void setUrl(String url) {
		System.out.println(url);
		this.url = url;
	}
	public String getUsername() {
		System.out.println(username);
		return username;
	}
	public void setUsername(String username) {
		System.out.println(username);
		this.username = username;
	}
	public String getPassword() {
		System.out.println(password);
		return password;
	}
	public void setPassword(String password) {
		System.out.println(password);
		this.password = password;
	}
	public String getDriver() {
		System.out.println(driver);
		return driver;
	}
	public void setDriver(String driver) {
		System.out.println(driver);
		this.driver = driver;
	}
	
	/*
	public DataSource getDataSource()
	{
		DriverManagerDataSource dm = new DriverManagerDataSource();
		dm.setDriverClassName(driver);
		dm.setUrl(url);
		dm.setUsername(username);
		dm.setPassword(password);
		return dm;
	}
	*/
	
	
}
