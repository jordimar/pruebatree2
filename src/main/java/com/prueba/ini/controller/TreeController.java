package com.prueba.ini.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TreeController {
	
	@GetMapping
	String getDatos()
	{
		System.out.println("Devuelve datos");
		
		return "datos";
	}
	

}
