package com.sachin.mysql.cache.ehcache_hibernate.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sachin.mysql.cache.ehcache_hibernate.pojo.Person;
import com.sachin.mysql.cache.ehcache_hibernate.service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	PersonService personService;

	@PostMapping("/add")
	public void addPerson(@RequestBody final Person person) {
		personService.addPerson(person);
	}
	
	@GetMapping("/all")
	public List<Person> getAllPerson() {
		return personService.getAllPerson();
	}
	
	@GetMapping("/search/{name}")
	public Person getPersonByName(@PathVariable final String name) {
		return personService.getPersonByName(name);
	}
}
