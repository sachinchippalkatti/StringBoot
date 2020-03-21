package com.example.sachin.RestServiceDemo.controller;

import java.awt.color.CMMException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sachin.RestServiceDemo.pojo.CustomProperties;
import com.example.sachin.RestServiceDemo.properties.ComplexProperty;

@RestController
@RequestMapping("/property")
public class CustomPropertyController {

	@Autowired
	CustomProperties customProperties;
	
	@Autowired
	ComplexProperty complexProperty;
	
	@GetMapping
	public ResponseEntity getCustomProperties() {
		
		return ResponseEntity.ok().body(customProperties.toString());
	}
	
	@GetMapping("/complex")
	public ResponseEntity getComplexProperty() {
		return ResponseEntity.ok().body(complexProperty.toString());
	}
}
