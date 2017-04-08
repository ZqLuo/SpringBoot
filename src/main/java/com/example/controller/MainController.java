package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.AbstractTemplateViewResolver;

//@RestController
public class MainController {

	@Autowired
	Environment env;
	
	//@RequestMapping("/")
	String home() {
		System.out.println(env.getProperty("profile"));
		return "Hello World!";
	}

	@RequestMapping("/hello/{myName}")
	String index(@PathVariable String myName) {
		return "Hello " + myName + "!!!";
	}
}
