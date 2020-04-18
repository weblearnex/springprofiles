package com.springprofiles.springprofiles.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@Value("${evn}")
	private String evn;
	
	@Value("${server.port}")
	private String port;
	
	
	@GetMapping("/")
	public String getServerInfo(){
		return evn;
	}
	
	@GetMapping("/profiledetails")
	public String profiledetails(){
		return "Active server is = "+evn+"<br/> Server port is = "+ port; 
	}

	
	
	
}
