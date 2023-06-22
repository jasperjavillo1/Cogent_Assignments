package com.example.demo1;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface EmployeeDAO {
	public int saveEmp(Employee emp) throws Exception;
	public boolean updateEmp(Employee emp, int id) throws Exception;
	public boolean deleteEmp(int id) throws Exception;;
	public List<Employee> findAll() throws Exception;;
}
