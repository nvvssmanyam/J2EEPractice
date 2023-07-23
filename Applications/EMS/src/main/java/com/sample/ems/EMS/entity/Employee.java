package com.sample.ems.EMS.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Employee {

	@Id
	@GeneratedValue
	private long emp_id;
	
	@Column
	private String emp_name;
	
	@Column
	private String emp_role;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="dept_id")
	@JsonIgnore
	private Department department;

	public long getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(long emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getEmp_role() {
		return emp_role;
	}

	public void setEmp_role(String emp_role) {
		this.emp_role = emp_role;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Employee(String emp_name, String emp_role) {
		super();
		this.emp_name = emp_name;
		this.emp_role = emp_role;
	}

	public Employee() {
		super();
	}
	
}
