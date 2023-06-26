package com.example.SpringbootJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UltramanDAORepository implements UltramanDAO {
	@Autowired
	JdbcTemplate jt;
	@Autowired
	DataSource ds;
	@Override
	public boolean addUltra(Ultraman u) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con =  ds.getConnection();
		String query = "insert into ultramen values (?,?,?)";
		int i = jt.update(query, new Object[] {u.getId(),u.getName(),u.getCodename()});
		if(i>0)
			return true;
		else
			return false;
	}

	@Override
	public boolean updateUltra(Ultraman u, int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con =  ds.getConnection();
		String query = "delete from ultramen where id = " + id;
		int i = jt.update(query);
		if(i>0)
		{
			query = "insert into ultramen values (?,?,?)";
			jt.update(query, new Object[] {u.getId(),u.getName(),u.getCodename()});
			return true;
		}
		else
			return false;
	}

	@Override
	public boolean deleteUltra(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con =  ds.getConnection();
		String query = "delete from ultramen where id = " + id;
		int i = jt.update(query);
		if(i>0)
			return true;
		else
			return false;
	}

	@Override
	public List<Ultraman> findAll() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con =  ds.getConnection();
		String query = "select * from ultramen";
		PreparedStatement ps = con.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		ArrayList<Ultraman> al = new ArrayList<Ultraman>();
		while(rs.next())
		{
			Ultraman u = new Ultraman();
			u.setId(rs.getInt(1));
			u.setName(rs.getString(2));
			u.setCodename(rs.getString(3));
			al.add(u);
		}
		return al;
	}

}
