package com.mysql.connection.serviceMysql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mysql.connection.serviceMysql.pojo.User;
import com.mysql.connection.serviceMysql.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping
	public ResponseEntity<List<User>> getUser() {
		List<User> user= userService.getUser();
		return ResponseEntity.ok().body(user);
	}
	
	@PostMapping("add")
	public Iterable<User> addUser(@RequestBody final User user) {
		userService.addUser(user);
		return userService.getUser();
	}

}
