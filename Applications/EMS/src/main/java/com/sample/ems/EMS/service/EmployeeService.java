package com.sample.ems.EMS.service;

import java.util.List;

import com.sample.ems.EMS.entity.Employee;

public interface EmployeeService {

	public List<Employee> getEmployees();
	
	public void saveEmployee(Long restId, Employee employee);
	
}
