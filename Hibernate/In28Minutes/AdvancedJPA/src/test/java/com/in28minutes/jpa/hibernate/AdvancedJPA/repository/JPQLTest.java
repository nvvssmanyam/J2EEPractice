package com.in28minutes.jpa.hibernate.AdvancedJPA.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

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
public class JPQLTest {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	EntityManager em;
	
	@Test
	public void jpql_basic() {
		String query = "Select c From Course c";
		List resultList = em.createQuery(query).getResultList();
		logger.info("Select c from Course c -> {}", resultList);
	}
	
	@Test
	public void jpql_typed() {
		String query = "Select c From Course c";
		TypedQuery<Course> createQuery = em.createQuery(query, Course.class);
		List<Course> resultList = createQuery.getResultList();
		logger.info("Select c from Course c -> {}", resultList);
	}
	
	@Test
	public void jpql_where() {
		String query = "Select c From Course c where name like '%Spring%'";
		TypedQuery<Course> createQuery = em.createQuery(query, Course.class);
		List<Course> resultList = createQuery.getResultList();
		logger.info("Select c from Course c -> {}", resultList);
	}
	
	@Test
	public void jpql_namedQueries() {
		TypedQuery<Course> createQuery = em.createNamedQuery("query_all_courses", Course.class);
		List<Course> resultList = createQuery.getResultList();
		logger.info("Select c from Course c -> {}", resultList);
	}
	
	/*
	 *  To execute Native SQL queries
	 *  In real time, want to mass update we should use native queries
	 *  JPQL will retrieve the record first then update 1st record then second and so on..,
	 */
	@Test
	@Transactional
	public void jpql_nativeQueries() {
		
		Query nativeQuery = em.createNativeQuery("UPDATE COURSE set last_updated_date=sysdate()", Course.class);
		int noOfRecordsUpdated = nativeQuery.executeUpdate();
		logger.info("Native update query no of records updated is -> {}", noOfRecordsUpdated);
		
	}
	
}
