package com.in28minutes.jpa.hibernate.AdvancedJPA.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.in28minutes.jpa.hibernate.AdvancedJPA.entity.Course;

@Repository
@Transactional
public class CourseRepository {
	
	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	@PersistenceContext
	EntityManager em;
	
	public Course findById(long id) {
		return em.find(Course.class, id);
	}
	
	public List<Course> getAll() {
		return em.createNamedQuery("query_all_courses", Course.class).getResultList();
	}
	
	public Course save(Course course) {
		em.persist(course);
		return course;
	}
	
	public Course update(Course course, long id) {
		
		Course updatedCourse = em.find(Course.class, id);
		
		if(updatedCourse != null) {
			updatedCourse.setName(course.getName());
			em.merge(updatedCourse);
		}
		
		return updatedCourse;
	}
	
	public void deleteById(Long id) {
		Course course = em.find(Course.class, id);
		em.remove(course);
	}
	
	public void palyWithEntityManager() {
		
		LOGGER.info("PlayWithEntityManager -- Start");
		
		Course course1 = new Course("Webservices in 100 steps");
		em.persist(course1);
		Course course2 = new Course("MicroServices in 100 steps");
		em.persist(course2);
		
		/*
		 *  Flush will sync the current persistence context to the DB
		 *  It will perform only DML(Insert, delete, update) but won't commit the transaction
		 */
		em.flush();
		
		/*
		 *  Detach will detach course2 entity with persistence context
		 *  After detach any DML will not be commit
		 *  Here course2.setName("***") 
		 */
		em.detach(course2);
		
		/*
		 *  Clear will detach all the entities from persistence context
		 *  After clear any DML will not be commit
		 */
		em.clear();
		
		
		course1.setName("Webservices in 100 steps - Updated");
		course2.setName("MicroServices in 100 steps - Updated");
		em.flush();
		
		Course course3 = new Course("JavaScript in 100 steps");
		em.persist(course3);
		em.flush();
		
		course3.setName("JavaScript in 100 steps - Updated");
		
		/*
		 *  Refresh method will reload the state of entiy instance from DB
		 *  the existing state of entity instance is overwritten
		 *  Here we will lost the course3.setName("***")
		 */
		em.refresh(course3);
		
		LOGGER.info("PlayWithEntityManager -- End");
		
	}
	
}
