package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Controller {
	
	@RequestMapping("/")
	public String index() {
		return "Ruinning!";
	}
	
	@RequestMapping("/json")
	public String json() {
		String respuesta = "{"
				+ "name:Emmanuel"
				+ "job:Developer}";
		return respuesta;
	}
	

}
