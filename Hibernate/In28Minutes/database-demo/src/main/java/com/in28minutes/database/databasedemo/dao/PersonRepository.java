package com.in28minutes.database.databasedemo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.in28minutes.database.databasedemo.entity.Person;

@Repository
public class PersonRepository {
	
	@PersistenceContext
	EntityManager entityManager;
	
	public List<Person> getAll() {
		return entityManager.createNamedQuery("find_all_persons", Person.class).getResultList();
	}
	
}
