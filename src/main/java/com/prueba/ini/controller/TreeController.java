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
	

	@GetMapping
	String getDatos2()
	{
		System.out.println("Devuelve datos2");
		System.out.println("Devuelve datos2 222");
		System.out.println("Devuelve datos2 3333");
		
		return "datos2";  
	}
	
	@GetMapping
	String getDatos3()
	{
		System.out.println("Devuelve datos3");
		System.out.println("Devuelve datos3 222");
		System.out.println("Devuelve datos3 3333");
		
		return "datos3";  
	}

	@GetMapping
	String getDatos4()
	{
		System.out.println("Devuelve datos4");
		System.out.println("Devuelve datos4 222");
		System.out.println("Devuelve datos4 3333");
		
		return "datos4";  
	}

}
