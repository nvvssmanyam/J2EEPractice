package com.in28minutes.database.databasedemo.entity;

public class Person {

	private int id;
	private String name;
	private String addr;
	private String dob;

	public Person() {
		super();
	}

	public Person(int id, String name, String addr, String dob) {
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

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

}
