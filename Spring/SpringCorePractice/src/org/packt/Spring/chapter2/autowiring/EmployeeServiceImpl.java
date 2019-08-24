package org.packt.Spring.chapter2.autowiring;

public class EmployeeServiceImpl implements EmployeeService {
	
	private Employee emp;
	
	public EmployeeServiceImpl(Employee emp) {
		this.emp = emp;
	}

	@Override
	public Employee getEmployee(String empId) {
		return emp.getEmployee(empId);
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	
}