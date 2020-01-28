package com.sample.ems.EMS.repository;

import org.springframework.data.repository.CrudRepository;

import com.sample.ems.EMS.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
