package com.example.lifeSight.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Pixel {

	@GetMapping("/createPixel")
	public String getcreatePixel() {
		return "Get createPixel";
	}
}
