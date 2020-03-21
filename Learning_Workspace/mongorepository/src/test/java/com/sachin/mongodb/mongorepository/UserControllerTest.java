package com.sachin.mongodb.mongorepository;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Collections;
import java.util.stream.Collectors;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.sachin.mongodb.mongorepository.Service.UserService;
import com.sachin.mongodb.mongorepository.controller.UserController;

@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest
//@WebMvcTest
//@ContextConfiguration(locations = "classpath:app-context.xml")
public class UserControllerTest {

	//@Autowired
	MockMvc mockmvc;
	
	@MockBean
	UserController userController;
	
	@Before
	public void setUp() {
		mockmvc = MockMvcBuilders.standaloneSetup(userController).build();
	}
	
	@Test
	public void testHelloWorld() throws Exception {
		mockmvc.perform(MockMvcRequestBuilders.get("/user/hello"))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().string(""));
	}
	@Test
	public void contextLoads() throws Exception{
		/*Mockito.when(userService.findAllUser()).thenReturn(Collections.emptyList());
		
		MvcResult mvcresult = mockmvc.perform(MockMvcRequestBuilders.get("/user/all")
									.accept(MediaType.APPLICATION_JSON)).andReturn();
		
		System.out.println(mvcresult.getResponse());
		
		Mockito.verify(userService).findAllUser();*/
	}
	
}
