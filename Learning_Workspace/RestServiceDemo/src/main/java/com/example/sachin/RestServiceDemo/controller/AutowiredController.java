package com.example.sachin.RestServiceDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sachin.RestServiceDemo.autowired.Animal;

@RestController
@RequestMapping("/autowire")
public class AutowiredController {
	
	//@Qualifier("dog")
	//@Autowired
	Animal animal;
	
	/*
	 * @Autowired void setAnimal(@Qualifier("cat") Animal animal) { this.animal =
	 * animal; }
	 */
	@Autowired()
	public AutowiredController(@Qualifier("dog") Animal animal) {
		super();
		this.animal = animal;
	}
	
	
	@GetMapping
	public ResponseEntity getMessage() {
		String value = animal.charatertices();
		return ResponseEntity.ok().body(value);
	}

	
}
