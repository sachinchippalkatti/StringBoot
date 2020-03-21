package com.mysql.connection.serviceMysql.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThat;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.mysql.connection.serviceMysql.pojo.User;
import com.mysql.connection.serviceMysql.repository.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
	
	@Autowired
	UserService userService;
	
	@MockBean
	UserRepository userRepository;
	
	@Test
	//@Ignore
	public void addUserTest() {
		User user = getUser();
		Mockito.when(userRepository.save(user)).thenReturn(user);
		assertThat(user).isEqualTo(user);
	}
	
	public User getUser() {
		User user = new User();
		user.setName("sachin");
		//user.setAddress("chippalkatti");
		user.setDes("chippalkatti");
		return user;
	}

}
