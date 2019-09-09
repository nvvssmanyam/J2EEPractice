package com.in28minutes.jpa.hibernate.AdvancedJPA;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.jpa.hibernate.AdvancedJPA.repository.CourseRepository;

@SpringBootApplication
public class AdvancedJpaApplication implements CommandLineRunner {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	CourseRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(AdvancedJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		logger.info("Find course of 10001 -> {}", repository.findById(10001));
	
		repository.deleteById(10003l);
		
	}

}
