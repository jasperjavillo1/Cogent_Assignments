package com.cogent.spring;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

@Component
public class DatabaseConfiguration {
	@Value("${jdbc.url}")
	private String url;
	@Value("${jdbc.user}")
	private String user;
	@Value("${jdbc.driver}")
	private String driver;
	@Value("${jdbc.password}")
	private String password;
	
	public DataSource getDataSource()
	{
		DriverManagerDataSource dm = new DriverManagerDataSource();
		dm.setDriverClassName(driver);
		dm.setUrl(url);
		dm.setUsername(user);
		dm.setPassword(password);
		return dm;
	}
}
