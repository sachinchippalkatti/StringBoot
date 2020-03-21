package com.example.sachin.RestServiceDemo.service;

import org.springframework.stereotype.Service;

import com.example.sachin.RestServiceDemo.exception.NoPersonException;
import com.example.sachin.RestServiceDemo.pojo.Person;

@Service
public class PersonService {
	
	public Person getPerson() throws NoPersonException{
		Person p = new Person();
		p.setName("anish");
		return p;		
	}
	
	public Person getPersonNullObject() throws NoPersonException{
		return null;
	}
	
	public Person getPersonException() throws NoPersonException {
	  throw new NoPersonException();
	}

}
