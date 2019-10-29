package com.in28minutes.jpa.hibernate.AdvancedJPA.repository;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.in28minutes.jpa.hibernate.AdvancedJPA.AdvancedJpaApplication;
import com.in28minutes.jpa.hibernate.AdvancedJPA.entity.Course;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=AdvancedJpaApplication.class)
public class CachingTest {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	CourseRepository repository;
	
	/* 
	 *  First level cache scope within the Transaction only
	 *  If we don't use @Transactional here, It will create individual transactions for every entity
	 *  
	 *  Below scenarios within single transaction, so it won't query 2 times
	 *  First time it will query, next time onwards it will fetch from cache till the transaction exist
	 */
	@Test
	@Transactional
	public void findById_cache_test() {
		Course course = repository.findById(10001);
		logger.info("Course details : -> {}",course);
		
		Course course1 = repository.findById(10001);
		logger.info("Course1 details : -> {}",course1);
		
		
		assertEquals("Spring in 100 steps", course.getName());
		assertEquals("Spring in 100 steps", course1.getName());
	}
	
	/*
	 *  Second level cache scope within the application context
	 *  Below two test case open two transactions separately 
	 *  but still don't query twice, because it's fetching from L2C
	 */
	
	@Test
	public void findById_second_level_cache_test1() {
		Course course = repository.findById(10002);
		logger.info("Course details : -> {}",course);		
		assertEquals("Spring in 100 steps", course.getName());
	}
	
	@Test
	public void findById_second_level_cache_test2() {
		Course course = repository.findById(10002);
		logger.info("Course details : -> {}",course);
		assertEquals("Spring in 100 steps", course.getName());
	}
	
}
