package com.in28minutes.jpa.hibernate.AdvancedJPA.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.jpa.hibernate.AdvancedJPA.entity.Course;
import com.in28minutes.jpa.hibernate.AdvancedJPA.excption.CourseNotFoundException;
import com.in28minutes.jpa.hibernate.AdvancedJPA.repository.CourseRepository;

@RestController
public class CourseController {

	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	CourseRepository courseRepo;
	
	@GetMapping("/course")
	public List<Course> getAllCourse() {
		return courseRepo.getAll(); 
	}
	
	@GetMapping("/course/{id}")
	public ResponseEntity<Object> getCourseById(@PathVariable long id) {
		Course course = courseRepo.findById(id);
		
		if (course == null) {
			throw new CourseNotFoundException("Course not found with id-"+id);
		} else {
			return new ResponseEntity<>(course, HttpStatus.OK);
		}
		
	}
	
}
