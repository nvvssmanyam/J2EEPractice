package com.in28minutes.jpa.hibernate.AdvancedJPA.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.in28minutes.jpa.hibernate.AdvancedJPA.entity.Passport;
import com.in28minutes.jpa.hibernate.AdvancedJPA.entity.Student;

@SpringBootTest
public class StudentRepositoryTest {

	@Autowired
	@PersistenceContext
	EntityManager em;
	
	Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Test
	@Transactional
	public void createStudnetWithPassport() {
		Passport passport = new Passport("Z123456");
		em.persist(passport);
		Student student = new Student("Subbu", passport);
		em.persist(student);
	}
	
	@Test
	public void retrieveStudentAndPassportDetails() {
		//Student student = em.find(Student.class, 1);
	}
	
}
