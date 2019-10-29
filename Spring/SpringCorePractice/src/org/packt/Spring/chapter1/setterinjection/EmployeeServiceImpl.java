package org.packt.Spring.chapter1.setterinjection;

public class EmployeeServiceImpl implements EmployeeService {
	
	private Employee emp;

	@Override
	public Employee getEmployee(String empId) {
		return emp.getEmployee(empId);
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	
}
