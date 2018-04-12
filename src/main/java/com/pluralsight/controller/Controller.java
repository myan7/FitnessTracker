package com.pluralsight.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {
	
	@RequestMapping(value="/")
	public String sayHello(Model model)
	{
		model.addAttribute("greeting", "Hello Spring");
		return "index";
	}
	
	@RequestMapping("/hello")
	public String printGreeting(Model model)
	{
		model.addAttribute("hello", "Hello Mr.MY");
		return "hello";
	}
	
	
}
