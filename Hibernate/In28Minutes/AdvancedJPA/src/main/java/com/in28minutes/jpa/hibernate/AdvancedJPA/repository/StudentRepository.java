package com.in28minutes.jpa.hibernate.AdvancedJPA.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.in28minutes.jpa.hibernate.AdvancedJPA.entity.Passport;
import com.in28minutes.jpa.hibernate.AdvancedJPA.entity.Student;

@Repository
@Transactional
public class StudentRepository {

	@Autowired
	EntityManager em;
	
	public Student findById(long id) {
		return em.find(Student.class, id);
	}
	
	public List<Student> getAllStudents() {
		
		
		return null;
	}
	
	public Student saveStudentWithPassport(Student student) {
		
		Passport passport = student.getPassport();
		em.persist(passport);
		
		em.persist(student);
		return student;
	}
}
