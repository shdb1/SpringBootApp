package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringBootController {
	
	
	@RequestMapping("/view")
	String sampleApi() {
		System.out.println("Hey normal controller is being executed...........");
		return "sample";
	}
	
	

}
