package com.sample.ems.EMS.service;

import java.util.List;

import com.sample.ems.EMS.entity.Restaurant;

public interface RestaurantService {

	public List<Restaurant> getRestaurants();
	
	public void saveRestaurant(Restaurant restaurant);
}
