package com.in28minutes.In28Minutes.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.in28minutes.In28Minutes.entity.User;

@Repository
@Transactional
public class UserDAO {
	
	@Autowired
	EntityManager entityManger;
	
	public User saveUser(User user) {
		entityManger.persist(user);
		entityManger.flush();
		return user;
	}

	public User findById(long id) {
		return entityManger.find(User.class, id);
	}
	
}
