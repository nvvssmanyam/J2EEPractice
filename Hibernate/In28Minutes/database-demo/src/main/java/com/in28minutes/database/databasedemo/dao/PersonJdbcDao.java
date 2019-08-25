package com.in28minutes.database.databasedemo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.in28minutes.database.databasedemo.entity.Person;

@Repository
public class PersonJdbcDao {

	@Autowired
	public JdbcTemplate template;

	public List<Person> getAll() {
		return template.query("select * from person", new BeanPropertyRowMapper(Person.class));
	}

}
