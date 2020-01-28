package com.sample.ems.EMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.ems.EMS.entity.Employee;
import com.sample.ems.EMS.service.EmployeeService;

@RestController
@RequestMapping("/restaurant/{restId}/department/{deptId}")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/employee")
	public List<Employee> getRestaurant() {
		return employeeService.getEmployees();
	}
	
	@PostMapping("/employee")
	public void saveRestaurant(@PathVariable Long deptId, @RequestBody Employee employee) {
		employeeService.saveEmployee(deptId, employee);
	}
	
}
