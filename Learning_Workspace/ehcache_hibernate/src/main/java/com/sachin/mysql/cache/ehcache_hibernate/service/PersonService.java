package com.sachin.mysql.cache.ehcache_hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.sachin.mysql.cache.ehcache_hibernate.pojo.Person;
import com.sachin.mysql.cache.ehcache_hibernate.repository.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	PersonRepository personrepo;

	public void addPerson(Person person) {
		// TODO Auto-generated method stub
		personrepo.save(person);
	}

	public List<Person> getAllPerson() {
		// TODO Auto-generated method stub
		return personrepo.findAll();
	}
	@Cacheable(value="personsearch", key="#name")
	public Person getPersonByName(String name) {
		// TODO Auto-generated method stub
		return personrepo.findByName(name);
	}

}
