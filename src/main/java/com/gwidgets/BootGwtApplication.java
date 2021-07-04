package com.gwidgets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootGwtApplication {


	public static void main(String[] args) {
		SpringApplication.run(BootGwtApplication.class, args).getEnvironment().getSystemProperties();
		
		
	}
}
