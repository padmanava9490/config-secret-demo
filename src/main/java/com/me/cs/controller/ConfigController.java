package com.me.cs.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class ConfigController {
	
	@Value("${username}")
	private String username;
	@Value("${password}")
	private String password;
	@Value("${dbname}")
	private String dbname;
	
	@GetMapping("/db")
    public String getDatabaseUsername() {
        return "Config Map Demo: <br/>User name = "+ username + "<br/>Password = "+password+ "<br/>Database Name = "+dbname;
    } 
}
