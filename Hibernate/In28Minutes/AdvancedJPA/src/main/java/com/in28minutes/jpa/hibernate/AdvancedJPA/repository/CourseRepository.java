package com.in28minutes.jpa.hibernate.AdvancedJPA.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.in28minutes.jpa.hibernate.AdvancedJPA.entity.Course;

@Repository
@Transactional
public class CourseRepository {

	@PersistenceContext
	EntityManager em;
	
	public Course save(Course course) {
		
		return course;
	}
	
	public Course findById(long id) {
		return em.find(Course.class, id);
	}
	
	public void deleteById(Long id) {
		Course course = em.find(Course.class, id);
		em.remove(course);
	}
	
}
