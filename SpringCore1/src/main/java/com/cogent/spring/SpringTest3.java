package com.cogent.spring;
import org.springframework.beans.factory.BeanFactory;
//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import java.sql.*;

public class SpringTest3 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("SprintTest3");
		BeanFactory actx = new ClassPathXmlApplicationContext("applicationContext.xml");
		DriverManagerDataSource emp1 = (DriverManagerDataSource)actx.getBean("datasource");
		Connection con = emp1.getConnection();
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
