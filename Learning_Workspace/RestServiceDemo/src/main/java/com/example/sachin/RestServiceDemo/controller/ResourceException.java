package com.example.sachin.RestServiceDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.sachin.RestServiceDemo.exception.NoPersonException;
import com.example.sachin.RestServiceDemo.pojo.Person;
import com.example.sachin.RestServiceDemo.service.PersonService;

@RestController
@RequestMapping("/exception")
public class ResourceException {
	
	@Autowired
	PersonService personService;
	
	@GetMapping
	public ResponseEntity getPersonDetails(){
		Person p = null;
		if(p == null) {
			try {
			p.getName();
			}catch(Exception e){
				return ResponseEntity.status(404).body(e.getStackTrace()[0]);
			}
		}
		p = new Person();
		p.setName("sachin");
		return ResponseEntity.status(200).body(p);
	}
	
	@RequestMapping(value="/happy", method=RequestMethod.GET)
	public ResponseEntity getPerson() throws NoPersonException {
		try {
			Person p = personService.getPerson();
			
			if(p== null)
				throw new NoPersonException("Person not found");
			
			return ResponseEntity.status(200).body(p);
		} catch (NoPersonException e) {
			// TODO Auto-generated catch block
			throw new NoPersonException("Internal person error");
		}
	}
	
	
	@RequestMapping(value="/null", method=RequestMethod.GET)
	public ResponseEntity getPersonNull() throws NoPersonException {
		try {
			Person p = personService.getPersonNullObject();
			
			if(p== null)
				throw new NoPersonException("Person null value found");
			
			return ResponseEntity.status(200).body(p);
		} catch (NoPersonException e) {
			// TODO Auto-generated catch block
			throw new NoPersonException("Internal person null");
		}
	}
	
	@RequestMapping(value="/error", method=RequestMethod.GET)
	public ResponseEntity getPersonException() throws NoPersonException {
		try {
			Person p = personService.getPersonException();
			
			if(p== null)
				throw new NoPersonException("Person exception found");
			
			return ResponseEntity.status(200).body(p);
		} catch (NoPersonException e) {
			// TODO Auto-generated catch block
			throw new NoPersonException("Internal person error");
		}
	}

}
