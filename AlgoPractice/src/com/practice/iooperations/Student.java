package com.practice.iooperations;

import java.io.Serializable;

public class Student implements Serializable {

	private static final long serialVersionUID = 102;

	private int rollno;
	private String name;
	
	public Student() {}
	
	public Student(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	
}
