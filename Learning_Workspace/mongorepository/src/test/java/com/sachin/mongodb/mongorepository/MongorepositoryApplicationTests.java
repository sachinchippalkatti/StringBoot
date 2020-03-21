package com.sachin.mongodb.mongorepository;

import java.util.Collections;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.sachin.mongodb.mongorepository.Service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
//@WebMvcTest
public class MongorepositoryApplicationTests {

	@Autowired
	MockMvc mockmvc;
	
	@MockBean
	UserService userService;
	
	@Test
	public void contextLoads() throws Exception {
		Mockito.when(userService.findAllUser()).thenReturn(Collections.emptyList());
		
		MvcResult mvcresult = mockmvc.perform(MockMvcRequestBuilders.get("/user/all")
									.accept(MediaType.APPLICATION_JSON))
									.andExpect(arg0).andReturn();
		
		System.out.println(mvcresult.getResponse());
		
		Mockito.verify(userService).findAllUser();
	}
	

}