package com.in28minutes.jpa.hibernate.AdvancedJPA;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.jpa.hibernate.AdvancedJPA.entity.Course;
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
		
		// Basic CRUD operations
		/*
		logger.info("Find course of 10001 -> {}", repository.findById(10001));
		logger.info("Creating new course -> {}", repository.save(new Course("AngularJS in 100 steps")));
		logger.info("Updating course 10002 -> {}", repository.update(new Course("Spring Boot in 100 steps - Updated"), 10002));
		repository.deleteById(10003l);
		*/
		
		repository.palyWithEntityManager();
	}

}
