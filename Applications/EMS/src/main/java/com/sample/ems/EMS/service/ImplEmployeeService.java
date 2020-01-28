package com.sample.ems.EMS.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.ems.EMS.entity.Department;
import com.sample.ems.EMS.entity.Employee;
import com.sample.ems.EMS.repository.DepartmentRepository;
import com.sample.ems.EMS.repository.EmployeeRepository;

@Service
public class ImplEmployeeService implements EmployeeService {

	@Autowired
	DepartmentRepository departmentRepo;
	
	@Autowired
	EmployeeRepository employeeRepo;
	
	@Override
	public List<Employee> getEmployees() {
		return (List<Employee>) employeeRepo.findAll();
	}

	@Override
	public void saveEmployee(Long deptId, Employee employee) {
		Optional<Department> department = departmentRepo.findById(deptId);
		if(department.isPresent()) {
			employee.setDepartment(department.get());
			employeeRepo.save(employee);
		}
	}

}
