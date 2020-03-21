package com.sachin.mongodb.mongorepository.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sachin.mongodb.mongorepository.Service.UserService;
import com.sachin.mongodb.mongorepository.document.User;

@RestController
@RequestMapping("/user")
public class UserController {
	
	private UserService userService;
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}

	@GetMapping("/hello")
	public String getHello() {
		return "Hello world";
	}


	@PostMapping("/add")
	public void addUser(@RequestBody final User user) {
		logger.info("Adding the user" + user.toString());
		userService.addUser(user);
	}
	
	@GetMapping("/all")
	public List<User> findAllUser() {
		logger.info("Get all the user");
		return userService.findAllUser();
	}
	
	@GetMapping("/{userId}")
	public Optional<User> findUserbyId(@PathVariable final Integer userId){
		return userService.findUserById(userId);
	}
	
	@PutMapping("/update")
	public User updateUser(@RequestBody final User user) {
		return userService.UpdateUser(user);
	}
	
	@DeleteMapping("/delete")
	public void deleteUser(@RequestBody final User user) {
		userService.deleteUser(user);
	}
	
	@DeleteMapping("/delete/{userId}")
	public void deleteUserById(@PathVariable final Integer userId) {
		userService.deleteUserById(userId);
	}

	@RequestMapping(value = "/all/xml", method = RequestMethod.GET,
			produces = { "application/json", "application/xml" })
		public List<User> findAllUserXml() {
		logger.info("Get all the user");
		return userService.findAllUser();
	}
}
