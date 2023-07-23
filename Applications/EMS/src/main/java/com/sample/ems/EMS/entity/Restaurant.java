package com.sample.ems.EMS.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Restaurant {

	@Id
	@GeneratedValue
	private long rest_id;
	
	@Column
	private String rest_name;
	
	@Column
	private String rest_location;
	
	@OneToMany(mappedBy="restaurant")
	private List<Department> departments;

	public long getRest_id() {
		return rest_id;
	}

	public void setRest_id(long rest_id) {
		this.rest_id = rest_id;
	}

	public String getRest_name() {
		return rest_name;
	}

	public void setRest_name(String rest_name) {
		this.rest_name = rest_name;
	}

	public String getRest_location() {
		return rest_location;
	}

	public void setRest_location(String rest_location) {
		this.rest_location = rest_location;
	}

	public Restaurant() {
		super();
	}

	public Restaurant(String rest_name, String rest_location) {
		super();
		this.rest_name = rest_name;
		this.rest_location = rest_location;
	}
	
}
