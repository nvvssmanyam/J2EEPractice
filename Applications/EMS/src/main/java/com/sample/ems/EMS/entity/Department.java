package com.sample.ems.EMS.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Department {

	@Id
	@GeneratedValue
	private long dept_id;
	
	@Column
	private String dept_name;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="rest_id")
	@JsonIgnore
	private Restaurant restaurant;
	
	@OneToMany(mappedBy="department")
	private List<Employee> employees;

	public long getDept_id() {
		return dept_id;
	}

	public void setDept_id(long dept_id) {
		this.dept_id = dept_id;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	public Department() {
		super();
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public Department(String dept_name) {
		super();
		this.dept_name = dept_name;
	}
	
}
