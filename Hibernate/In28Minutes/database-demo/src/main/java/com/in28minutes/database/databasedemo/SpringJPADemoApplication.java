package com.in28minutes.database.databasedemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.database.databasedemo.dao.PersonRepository;

@SpringBootApplication
public class SpringJPADemoApplication implements CommandLineRunner {
	
	Logger logger = LoggerFactory.getLogger(SpringJPADemoApplication.class);
	
	@Autowired
	PersonRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJPADemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		logger.info("Get all persons -> {}", repository.getAll());
		
	}

}
