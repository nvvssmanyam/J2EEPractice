package com.in28minutes.In28Minutes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan
public class RestBasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestBasicApplication.class, args);
	}
	
	

}
