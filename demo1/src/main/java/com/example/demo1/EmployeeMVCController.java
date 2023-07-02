package com.example.demo1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class EmployeeMVCController {
	@Autowired
	EmployeeDAO empd;
	
	@PostMapping(value = "/addEmployee")
	public String addEmployee(@ModelAttribute Employee emp) throws Exception
	{
		if(empd.saveEmp(emp)>0)
			return "Home";
		else
			return "EmployeeForm";
	}
	/*
	@PutMapping(value = "/{id}/updateEmployee")
	public String updateEmployee(@ModelAttribute Employee emp,@PathVariable int id) throws Exception
	{
		if(empd.updateEmp(emp,id))
			return "Employee update";
		else
			return "Employee not updated";
	}
	@DeleteMapping(value = "/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable int id) throws Exception
	{
		if(empd.deleteEmp(id))
			return "Employee deleted";
		else
			return "Employee not deleted";
	}*/
	@GetMapping(value = "/getEmployees")
	public String getEmployees() throws Exception
	{
		List<Employee> l = empd.findAll();
		return "EmployeeTable";
	}
	
	@GetMapping(value = "/GetEmployeeForm")
	public String loadEmployee()
	{
		//Render EmployeeForm.jsp
		return "EmployeeForm";
	}
}
