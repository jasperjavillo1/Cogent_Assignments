package com.example.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAORepository implements UserDAO {
@Autowired
DatabaseConfiguration dbconfig;
	@Override
	public boolean saveUser(User user) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String driver = dbconfig.getDriver();
		String url = dbconfig.getUrl();
		String username = dbconfig.getUsername();
		String password = dbconfig.getPassword();
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, username, password);
		String query = "insert into userdetail values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1,user.getId());
		ps.setString(2, user.getName());
		ps.setString(3, user.getEmail());
		ps.setInt(4, user.getAge());
		int i = ps.executeUpdate();
		if(i>0)
			return true;
		else
			return false;
	}

	@Override
	public boolean updateUser(User user, int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String driver = dbconfig.getDriver();
		String url = dbconfig.getUrl();
		String username = dbconfig.getUsername();
		String password = dbconfig.getPassword();
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, username, password);
		String query = "select * from userdetail where id = " + id;
		PreparedStatement ps = con.prepareStatement(query);
		if(ps.executeUpdate()>1)
		{
			query = "delete from userdetail where id = " + id;
			ps = con.prepareStatement(query);
			ps.executeUpdate();
			query = "insert into userdetail values (?,?,?,?)";
			ps = con.prepareStatement(query);
			ps.setInt(1,user.getId());
			ps.setString(2, user.getName());
			ps.setString(3, user.getEmail());
			ps.setInt(4, user.getAge());
			int i = ps.executeUpdate();
			return true;
		}
		else
			return false;
	}

	@Override
	public boolean deleteUser(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String driver = dbconfig.getDriver();
		String url = dbconfig.getUrl();
		String username = dbconfig.getUsername();
		String password = dbconfig.getPassword();
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, username, password);
		String query = "select * from userdetail where id = " + id;
		PreparedStatement ps = con.prepareStatement(query);
		if(ps.executeUpdate()>1)
		{
			query = "delete from userdetail where id = " + id;
			ps = con.prepareStatement(query);
			ps.executeUpdate();
			return true;
		}
		else
			return false;
	}

	@Override
	public List<User> findAll() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String driver = dbconfig.getDriver();
		String url = dbconfig.getUrl();
		String username = dbconfig.getUsername();
		String password = dbconfig.getPassword();
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, username, password);
		String query = "select * from userdetail";
		PreparedStatement ps = con.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		ArrayList<User> al = new ArrayList<User>();
		while(rs.next())
		{
			User u = new User();
			u.setId(rs.getInt(1));
			u.setName(rs.getString(2));
			u.setEmail(rs.getString(3));
			u.setAge(rs.getInt(4));
			al.add(u);
		}
		return al;
	}

}
