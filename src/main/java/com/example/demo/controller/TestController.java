package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	
//@Value("${project.type}")
String myProperty;
	
	/*@RequestMapping("/")
	String runRestApp() {
		System.out.println("myProperty::"+myProperty);
		return "Testing Being Done!!!";
	}*/
}


