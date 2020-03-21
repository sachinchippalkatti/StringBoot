package com.example.lifeSight.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class LifeSightController {

	@GetMapping("/get")
	public String getWelcome() {
		return "Get Welcome";
	}
	
	@PostMapping("/post")
	public String postWelcome() {
		return "Post Welcome";
	}
}
