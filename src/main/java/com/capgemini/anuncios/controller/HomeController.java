package com.capgemini.anuncios.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping( method = RequestMethod.GET, path = "/")
	public String slash() {
		return "index";
		
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/home")
	public String home() {
		return "index";
		
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/index")
	public String index() {
		return "index";
		
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "error")
	public String error() {
		return "error";
		
	}
	

}
