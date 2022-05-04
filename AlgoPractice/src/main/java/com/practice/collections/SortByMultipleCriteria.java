package com.practice.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparator<Student> {
	
	private int rollNo;
	private int age;
	private String name;
	
	public Student() {}
	
	public Student(int rollNo, int age, String name) {
		super();
		this.rollNo = rollNo;
		this.age = age;
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", age=" + age + ", name=" + name + "]";
	}

	public int compare(Student s1, Student s2) {
		int idComp = ((Integer) s1.getRollNo()).compareTo(s2.getRollNo());
		if(idComp == 0) {
			int nameComp = s1.getName().compareTo(s2.getName());
			return nameComp;
		} else {
			return idComp;
		}
	}
	
}

public class SortByMultipleCriteria {

	public static void main(String[] args) {
		Student s1 = new Student(1, 28, "Raju");
		Student s2 = new Student(1, 29, "Ramu");
		Student s3 = new Student(2, 28, "Raja");
		Student s4 = new Student(3, 28, "Raj");
		
		List<Student> list = new ArrayList<>();
		list.add(s2);
		list.add(s1);
		list.add(s3);
		list.add(s4);
		
		Comparator comparator = new Student();
		
		Collections.sort(list, comparator);
		
		System.out.println(list);
		
	}

}
