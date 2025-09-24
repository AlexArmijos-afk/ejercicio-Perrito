package com.practica.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/practica")
public class perroController {
	@GetMapping("/perrito")
	public String perrito() {
		return "perrito";
	}
	
}
