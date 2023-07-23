package com.in28minutes.In28Minutes.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="table_user")
public class User {

	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String addr;
	
	public User(String name, String addr) {
		super();
		this.name = name;
		this.addr = addr;
	}
	
	public User() {
		super();
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", addr=" + addr + "]";
	}
	public long getId() {
		return id;
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
	
}
