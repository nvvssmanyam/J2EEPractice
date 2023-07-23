package com.sample.ems.EMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.ems.EMS.entity.Department;
import com.sample.ems.EMS.service.DepartmentService;

@RestController
@RequestMapping("/restaurant/{restId}")
public class DepartmentController {

	@Autowired
	DepartmentService departmentService;
	
	@GetMapping("/department")
	public List<Department> getRestaurant() {
		return departmentService.getDepartments();
	}
	
	@PostMapping("/department")
	public void saveRestaurant(@PathVariable Long restId, @RequestBody Department department) {
		departmentService.saveDepartment(restId, department);
	}
	
}
