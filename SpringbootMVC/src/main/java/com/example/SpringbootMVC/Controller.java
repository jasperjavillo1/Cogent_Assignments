package com.example.SpringbootMVC;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping(path="/greet/{name}")
	public ModelMap hello(@PathVariable String name)
	{
		String message = "Hello " + name;
		ModelMap model = new ModelMap();
		model.addAttribute("greeting", message);
		return model;
	}
}
