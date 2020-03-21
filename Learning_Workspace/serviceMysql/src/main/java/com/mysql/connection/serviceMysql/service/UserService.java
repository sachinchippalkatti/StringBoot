package com.mysql.connection.serviceMysql.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysql.connection.serviceMysql.pojo.User;
import com.mysql.connection.serviceMysql.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public List<User> getUser() {
		// TODO Auto-generated method stub
		List<User> user = new ArrayList<>();
		userRepository.findAll().forEach(user::add);;
		return user;
	}

	public void addUser(User user) {
		// TODO Auto-generated method stub
		user.setDate(new Date());
		userRepository.save(user);
	}

}
