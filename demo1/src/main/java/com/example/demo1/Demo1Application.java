package com.example.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo1Application implements CommandLineRunner{
	/*@Autowired
	EmployeeDAO edao;
	@Autowired
	UserDAO udao;*/
	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*
		User u = new User();
		u.setId(7);
		u.setName("AAA");
		u.setEmail("aaa@email.com");
		u.setAge(25);
		udao.saveUser(u);
		*/
	}

}
