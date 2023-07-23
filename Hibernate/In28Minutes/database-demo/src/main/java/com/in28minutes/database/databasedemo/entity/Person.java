package com.in28minutes.database.databasedemo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="find_all_persons", query="select p from Person p")
public class Person {

	@Id
	private int id;
	private String name;
	private String addr;
	private Date dob;

	public Person() {
		super();
	}

	public Person(int id, String name, String addr, Date dob) {
		super();
		this.id = id;
		this.name = name;
		this.addr = addr;
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", addr=" + addr + ", dob=" + dob + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

}
