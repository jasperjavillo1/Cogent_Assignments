package com.example.demo1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo1.User;
//import com.example.demo1.DatabaseConfiguration;


@RestController
public class UserController {
	@Autowired UserDAO user;
	
	
	@PostMapping(value = "/{addUser}")
	public String create(@ModelAttribute User user1) throws IOException, SQLException, ClassNotFoundException
	{
		//DataSource ds = (DataSource)(dbconfig.getDataSource());
		if(user.saveUser(user1))
			return "User inserted";
		else
			return "User not inserted";
	}
	
	@PutMapping(value = "/{id}/{updateUser}")
	public String update(@PathVariable int id,@ModelAttribute User user1) throws IOException, SQLException, ClassNotFoundException
	{
		//DataSource ds = (DataSource)(dbconfig.getDataSource());
		if(user.updateUser(user1,id))
			return "User inserted";
		else
			return "User not inserted";
	}
	
	@DeleteMapping(value = "/updateUser/{id}")
	public String update(@PathVariable int id) throws IOException, SQLException, ClassNotFoundException
	{
		//DataSource ds = (DataSource)(dbconfig.getDataSource());
		if(user.deleteUser(id))
			return "User deleted";
		else
			return "User not deleted";
	}
	
	@GetMapping(value ="/getUsers")
	public ArrayList<User> getUser() throws IOException, ClassNotFoundException, SQLException
	{
		ArrayList<User> al = new ArrayList<>();
		
		return al;
	}
	
}
