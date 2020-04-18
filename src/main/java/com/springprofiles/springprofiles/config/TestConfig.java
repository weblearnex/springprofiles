package com.springprofiles.springprofiles.config;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

//@Profile("test")
//@Configuration
public class TestConfig {
	
	@PostConstruct
	public void getMessage(){
		System.out.println("test ENV running");
	}

}
