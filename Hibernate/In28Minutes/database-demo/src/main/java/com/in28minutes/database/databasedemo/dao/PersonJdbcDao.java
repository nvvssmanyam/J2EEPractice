package com.in28minutes.database.databasedemo.dao;

import java.sql.Timestamp;
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
	
	public Person getPersonById(int id) {
		return (Person) template.queryForObject("select * from person where id=?", new Object[] {id} ,new BeanPropertyRowMapper(Person.class));
	}
	
	public Object insert(Person person) {
		return template.update("insert into person (id, name, addr, dob) values (?, ?, ?, ?)", 
				new Object[] {person.getId(), person.getName(), person.getAddr(), person.getDob()});
	}
	
	public int update(Person person) {
		return template.update("update person " + " set name = ?, addr = ?, dob = ? " + " where id = ?",
				new Object[] { person.getName(), person.getAddr(), new Timestamp(person.getDob().getTime()),
						person.getId() });
	}
	
	public int deletePersonById(int id) {
		return template.update("delete from person where id=?", new Object[] {id});
	}


}
