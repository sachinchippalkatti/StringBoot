package com.sachin.mongotempleate.mongotemplateexample.contoller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sachin.mongotempleate.mongotemplateexample.dal.UserDALImp;
import com.sachin.mongotempleate.mongotemplateexample.document.User;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserDALImp userDALImp;

	@PostMapping("/add")
	public void addUser(@RequestBody final User user) {
		userDALImp.addNewUser(user);
	}
	
	@GetMapping("/all")
	public List<User> getAllUser(){
		return userDALImp.getAllUser();
	}
	
	@GetMapping("{userId}")
	public User getUserById(@PathVariable final Integer userId) {
		return userDALImp.getUserById(userId);
	}
	
	@GetMapping("/setting/{userId}")
	public Map<String, String> getUserByIdSetting(@PathVariable final Integer userId) {
		return userDALImp.getUserSetting(userId);
	}
	
		
	@PutMapping("/update")
	public void updateUser(@RequestBody final User user) {
		userDALImp.updateUser(user);
	}
	
	@PutMapping("/update/setting/{userId}")
	public void updateSetting(@PathVariable final Integer userId,@RequestBody final Map<String,String> setting) {
		userDALImp.updateSetting(userId, setting);
	}
}
