package com.mysql.connection.serviceMysql.controller;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.mysql.connection.serviceMysql.service.UserService;

@RunWith(SpringRunner.class)
@WebMvcTest(value=UserController.class,secure = false)
public class UserControllerTest {

	@Autowired
	MockMvc mockmvc;
	
	@MockBean
	UserService userService;
}
