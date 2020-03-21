package com.example.sachin.swagger_test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	
	@GetMapping("/")
	public String getMessageAll() {
		return "Welcome All";
	}
	
	@GetMapping("/user")
	public String getMessage() {
		return "Welcome user and Admin";
	}
	
	@GetMapping("/admin")
	public String getMessageAdmin() {
		return "Welcome only Admin";
	}
}
