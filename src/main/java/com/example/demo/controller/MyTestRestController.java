package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ComponentScan("com")
public class MyTestRestController {
	@Autowired
	JdbcTemplate JdbcTemplate;
	
	@RequestMapping("/samplerest")
	String sampleApi() {
		
		
		System.out.println();
		return "Api Works!!!!";
	}

}
