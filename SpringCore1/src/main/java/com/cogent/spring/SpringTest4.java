package com.cogent.spring;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import java.sql.*;

import javax.sql.DataSource;

public class SpringTest4 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("SprintTest4");
		AbstractApplicationContext actx = new AnnotationConfigApplicationContext(AppConfiguration.class);
		DatabaseConfiguration dc = (DatabaseConfiguration)actx.getBean(DatabaseConfiguration.class);
		DataSource ds = dc.getDataSource();
		Connection con = ds.getConnection();
		String query = "select * from employee";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		while(rs.next())
		{
			System.out.println("id: " + rs.getInt(1));
			System.out.println("name: " + rs.getString(2));
			System.out.println("email: " + rs.getString(3));
			System.out.println("salary: " + rs.getDouble(4));
		}
	}

}
