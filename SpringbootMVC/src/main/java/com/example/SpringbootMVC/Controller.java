package com.example.SpringbootMVC;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping(path="/greet/{name}")
	public String hello(@PathVariable String name)
	{
		return "Hello " + name;
	}
}
