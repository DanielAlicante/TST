package com.example.demo.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.modelo.Usuario;




@RestController
public class DemoController {

	@CrossOrigin  // error de CORS: has been blocked by CORS policy: No 'Access-Control-Allow-Origin' header is present on the requested resource.
	@GetMapping("/hello")
	public Object sayHello() {
//		Usuario user = new Usuario();
//		return new Usuario().toString();
		return new Usuario();
//		return "Hello";
	}
	
	
	@CrossOrigin  // error de CORS: has been blocked by CORS policy: No 'Access-Control-Allow-Origin' header is present on the requested resource.
	@PostMapping("/postNombre")
	public Object postNombre() {
		Usuario user = new Usuario();
		
		
//		return new Usuario().toString();
		return user;

	}
	
	
}
