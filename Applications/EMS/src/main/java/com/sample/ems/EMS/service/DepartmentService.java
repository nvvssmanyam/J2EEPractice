package com.sample.ems.EMS.service;

import java.util.List;

import com.sample.ems.EMS.entity.Department;

public interface DepartmentService {

	public List<Department> getDepartments();
	
	public void saveDepartment(Long restId, Department department);
	
}
