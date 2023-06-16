package com.cogent.spring;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		ApplicationContext actx = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("Context:" + actx);
		Employee emp1 = (Employee)actx.getBean("emp");
		Employee emp2 = (Employee)actx.getBean("emp");
		System.out.println(emp1);
		System.out.println(emp2);
		*/
		BeanFactory actx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee emp1 = (Employee)actx.getBean("emp");
		System.out.println(emp1);
		System.out.println(emp1.getAddress());
	}

}
