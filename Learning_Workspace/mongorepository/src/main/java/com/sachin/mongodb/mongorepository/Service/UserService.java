package com.sachin.mongodb.mongorepository.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sachin.mongodb.mongorepository.document.User;
import com.sachin.mongodb.mongorepository.repository.UserRepository;

@Service
public class UserService {
	
	private static UserRepository userRepository;
	
	
	
	public UserService(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}



	public static void addUser(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
	}



	public List<User> findAllUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}



	public Optional<User> findUserById(Integer userId) {
		// TODO Auto-generated method stub
		return userRepository.findById(userId);
	}



	public User UpdateUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}



	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		userRepository.delete(user);
	}



	public void deleteUserById(Integer userId) {
		// TODO Auto-generated method stub
		userRepository.deleteById(userId);
	}

}
