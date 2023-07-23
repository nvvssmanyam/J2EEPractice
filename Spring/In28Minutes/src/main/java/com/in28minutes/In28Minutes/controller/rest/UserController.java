package com.in28minutes.In28Minutes.controller.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.In28Minutes.dao.UserDAO;
import com.in28minutes.In28Minutes.entity.User;

@RestController
public class UserController {

	@Autowired
	UserDAO userDao;
	
	Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping(value= {"/", "/home"}, method=RequestMethod.GET)
	public String welcomeMessage() {
		return "Hello all !!!";
	}
	
	@PostMapping("/user")
	public User saveUser(@RequestBody User user) {
		LOGGER.info("User from request -> {}"+user);
		return userDao.saveUser(user);
	}
	
	@GetMapping("/user/{userId}")
	public User getUserById(@PathVariable("userId") long id) {
		return userDao.findById(id);
	}
	
	
	/*  
	 *  @Request param is working with only form data, not with JSON data
	 */
	@PostMapping(value="/username", consumes="application/json")
	public String saveUser(@RequestParam("name") String name, @RequestParam String addr) {
		LOGGER.info("Request param name -> {}"+name);
		LOGGER.info("Addr -> {}"+addr);
		return name;
	}
	
}
