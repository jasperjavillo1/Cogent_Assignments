package com.example.demo1;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeDAOImpl implements EmployeeDAO {
	@Autowired
	EmployeeRepository emprepo;
	
	
	@Override
	public int saveEmp(Employee emp) throws Exception {
		// TODO Auto-generated method stub
		if(emprepo.save(emp)!= null)
			return 1;
		else
			return 0;
	}

	@Override
	public boolean updateEmp(Employee emp, int id) throws Exception {
		// TODO Auto-generated method stub
		if(emprepo.existsById(id))
		{
			emprepo.deleteById(id);
			emprepo.save(emp);
			return true;
		}
		else
			return false;
	}

	@Override
	public boolean deleteEmp(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		if(emprepo.existsById(id))
		{
			emprepo.deleteById(id);
			return true;
		}
		else
			return false;
	}

	@Override
	public List<Employee> findAll() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return emprepo.findAll();
	}

}
