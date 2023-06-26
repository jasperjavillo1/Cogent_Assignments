package com.example.SpringbootJDBC;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface UltramanDAO {
	public boolean addUltra(Ultraman u) throws ClassNotFoundException, SQLException;
	public boolean updateUltra(Ultraman u, int id) throws ClassNotFoundException, SQLException;
	public boolean deleteUltra(int id) throws ClassNotFoundException, SQLException;
	public List<Ultraman> findAll() throws ClassNotFoundException, SQLException;
}
