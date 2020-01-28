package com.sample.ems.EMS.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.ems.EMS.entity.Department;
import com.sample.ems.EMS.entity.Restaurant;
import com.sample.ems.EMS.repository.DepartmentRepository;
import com.sample.ems.EMS.repository.RestaurantRepository;

@Service
public class ImplDepartmentService implements DepartmentService {

	@Autowired
	DepartmentRepository departmentRepo;
	
	@Autowired
	RestaurantRepository restaurantRepo;
	
	@Override
	public List<Department> getDepartments() {
		return (List<Department>) departmentRepo.findAll();
	}

	@Override
	public void saveDepartment(Long restId, Department department) {
		Optional<Restaurant> restaurant = restaurantRepo.findById(restId);
		if(restaurant.isPresent()) {
			department.setRestaurant(restaurant.get());
			departmentRepo.save(department);
		}
	}

}
