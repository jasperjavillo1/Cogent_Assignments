package com.cogent.spring;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext actx = new AnnotationConfigApplicationContext(AppConfiguration.class);
		Employee emp1 = (Employee)actx.getBean(Employee.class);
		System.out.println(emp1);
		System.out.println(emp1.getAddress());
		actx.registerShutdownHook();
	}

}
