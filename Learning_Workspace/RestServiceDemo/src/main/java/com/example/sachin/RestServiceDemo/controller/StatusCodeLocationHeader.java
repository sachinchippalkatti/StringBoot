package com.example.sachin.RestServiceDemo.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sachin.RestServiceDemo.pojo.Person;

@RestController
@RequestMapping("/responce")
public class StatusCodeLocationHeader {
	
	@GetMapping
	public ResponseEntity<String> getStatusCode() {
		return ResponseEntity.accepted().header("accept", "Responce").build();
	}
	
	@GetMapping("/person")
	public ResponseEntity<Person> getPerson(){
		Person p = new Person();
		p.setName("sachin");
		
		return ResponseEntity.status(200).body(p);
	}

}
