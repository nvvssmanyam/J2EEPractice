package com.sample.ems.EMS.repository;

import org.springframework.data.repository.CrudRepository;

import com.sample.ems.EMS.entity.Department;

public interface DepartmentRepository extends CrudRepository<Department, Long> {

}
