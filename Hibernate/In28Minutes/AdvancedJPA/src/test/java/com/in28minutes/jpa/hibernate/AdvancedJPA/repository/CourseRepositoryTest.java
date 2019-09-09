package com.in28minutes.jpa.hibernate.AdvancedJPA.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.in28minutes.jpa.hibernate.AdvancedJPA.AdvancedJpaApplication;
import com.in28minutes.jpa.hibernate.AdvancedJPA.entity.Course;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=AdvancedJpaApplication.class)
public class CourseRepositoryTest {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	CourseRepository repository;
	
	@Test
	public void findById_test() {
		Course course = repository.findById(10001);
		assertEquals("Spring in 100 steps", course.getName());
	}
	
	@Test
	public void deleteById_test() {
		repository.deleteById(10003L);
		assertNull(repository.findById(10003l));
	}
	
}
