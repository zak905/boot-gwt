package com.gwidgets;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootGwtApplication {
	
	@Value("${test}")
	String test;

	public static void main(String[] args) {
		SpringApplication.run(BootGwtApplication.class, args
				).getEnvironment().getSystemProperties().put("test", "test");
		
		
	}
}
