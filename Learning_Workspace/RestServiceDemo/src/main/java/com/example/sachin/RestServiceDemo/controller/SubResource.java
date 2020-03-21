package com.example.sachin.RestServiceDemo.controller;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sub")
public class SubResource {

	@GetMapping("/{subName}")
	public String getSubMessage(@PathVariable("subName") String subName) {
		return "Sub resource" + subName;
	}
	
	@GetMapping
	public String getSunResourceMessage() {
		return "In sub resource";
	}
	
	/*@GetMapping("/matrix/{name}")
	public String getSubMessageMatrixParam(@MatrixVariable("name") String name) {
		return "Sub resource" + name;
	} this is not supported my spring boot*/
}
