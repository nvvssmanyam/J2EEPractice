package com.in28minutes.database.databasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.database.databasedemo.dao.PersonJdbcDao;
import com.in28minutes.database.databasedemo.entity.Person;

@SpringBootApplication
public class SpringJDBCDemoApplication implements CommandLineRunner {

	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJdbcDao personJdbcDao;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJDBCDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Persons list -> {}", personJdbcDao.getAll());
		
		logger.info("Person with id : 10002 -> {}", personJdbcDao.getPersonById(10002));
		
		logger.info("Inserting -> {}", 
				personJdbcDao.insert(new Person(10004, "Tara", "Berlin", new Date())));
		
		logger.info("Person deleted with id : 10003 and no of rows deleted is -> {}", personJdbcDao.deletePersonById(10003));
		
		logger.info("Update 10002 -> {}", 
				personJdbcDao.update((new Person(10002, "Peter", "Utrecht", new Date()))));
	}

}
