package com.prueba.ini.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TreeController {
	
	@GetMapping
	String getDatos()
	{
		System.out.println("Devuelve datos");
		System.out.println("Devuelve datos 222");
		System.out.println("Devuelve datos 3333");
		
		return "datos";  
	}
	

}
