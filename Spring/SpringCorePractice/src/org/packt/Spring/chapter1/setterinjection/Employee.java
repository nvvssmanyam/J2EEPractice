package org.packt.Spring.chapter1.setterinjection;

public class Employee {
	
	private String name;
	private int age;
	private String empId;
	
	public Employee() {
		super();
	}
	
	public Employee(String name, int age, String empId) {
		super();
		this.name = name;
		this.age = age;
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	
	public Employee getEmployee(String empId) {
		return this;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", empId=" + empId + "]";
	}
	
}
