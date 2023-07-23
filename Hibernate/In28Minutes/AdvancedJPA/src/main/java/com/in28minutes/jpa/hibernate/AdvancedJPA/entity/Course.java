package com.in28minutes.jpa.hibernate.AdvancedJPA.entity;

import java.time.LocalDateTime;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

/*
 *  Only one named query will be allowd with annotation @NamedQuery
 *  If we want use multiple should use  
 */
@Entity
@NamedQueries(value = { @NamedQuery(name = "query_all_courses", query = "Select c From Course c"),
		@NamedQuery(name = "query_courses_name_has_spring", query = "select c from Course c where name like '%Spring%'") })
@Cacheable
public class Course {

	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private String name;

	@CreatedDate
	private LocalDateTime createdDate;

	@UpdateTimestamp
	private LocalDateTime lastUpdatedDate;

	public Course(String name) {
		super();
		this.name = name;
	}

	public Course() {
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

}
