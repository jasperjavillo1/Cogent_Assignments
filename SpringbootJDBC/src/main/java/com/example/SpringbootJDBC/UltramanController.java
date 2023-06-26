package com.example.SpringbootJDBC;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UltramanController {
	@Autowired
	UltramanDAO ultraman;
	
	@PostMapping(value = "/addUltraman")
	public String add(@ModelAttribute Ultraman ultra) throws ClassNotFoundException, SQLException
	{
		if(ultraman.addUltra(ultra))
			return "Entry Added";
		else
			return "Entry Failed";
	}
	@PutMapping(value = "/updateUltraman/{id}")
	public String update(@ModelAttribute Ultraman ultra,@PathVariable int id) throws ClassNotFoundException, SQLException
	{
		if(ultraman.updateUltra(ultra, id))
			return "Entry Updated";
		else
			return "Update Failed";
	}
	@DeleteMapping(value = "/deleteUltraman/{id}")
	public String delete(@PathVariable int id) throws ClassNotFoundException, SQLException
	{
		if(ultraman.deleteUltra(id))
			return "Entry Deleted";
		else
			return "Delete Failed";
	}
	@GetMapping(value = "/findUltramen")
	public List<Ultraman> findAll() throws ClassNotFoundException, SQLException
	{
		return ultraman.findAll();
	}
}
