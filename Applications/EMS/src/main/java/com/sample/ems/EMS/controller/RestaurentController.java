package com.sample.ems.EMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sample.ems.EMS.entity.Restaurant;
import com.sample.ems.EMS.service.RestaurantService;

@RestController
public class RestaurentController {

	@Autowired
	RestaurantService restaurantService;
	
	@GetMapping("/restaurant")
	public List<Restaurant> getRestaurant() {
		return restaurantService.getRestaurants();
	}
	
	@PostMapping("/restaurant")
	public void saveRestaurant(@RequestBody Restaurant restaurant) {
		restaurantService.saveRestaurant(restaurant);
	}
	
}
