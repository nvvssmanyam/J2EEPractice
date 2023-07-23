package com.sample.ems.EMS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.ems.EMS.entity.Restaurant;
import com.sample.ems.EMS.repository.RestaurantRepository;

@Service
public class ImplRestaurantService implements RestaurantService {
	
	@Autowired
	RestaurantRepository restaurantRepo;

	@Override
	public List<Restaurant> getRestaurants() {
		return (List<Restaurant>) restaurantRepo.findAll();
	}

	@Override
	public void saveRestaurant(Restaurant restaurant) {
		restaurantRepo.save(restaurant);
	}

}
