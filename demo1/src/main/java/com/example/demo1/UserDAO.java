package com.example.demo1;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface UserDAO {
	public boolean saveUser(User user) throws ClassNotFoundException, SQLException;
	public boolean updateUser(User user, int id) throws ClassNotFoundException, SQLException;
	public boolean deleteUser(int id) throws ClassNotFoundException, SQLException;;
	public List<User> findAll() throws ClassNotFoundException, SQLException;;
}
