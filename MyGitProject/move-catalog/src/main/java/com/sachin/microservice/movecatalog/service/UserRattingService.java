package com.sachin.microservice.movecatalog.service;

import java.util.Arrays;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.sachin.microservice.movecatalog.Rating;
import com.sachin.microservice.movecatalog.UserRatting;

@Service
public class UserRattingService {
	
	@Autowired
	private RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod="getUserRattingFallBack")
	public UserRatting getUserRatting(String userId) {
		return restTemplate.getForObject("http://localhost:8980/rating/byuser/" + userId ,UserRatting.class);
	}
	
	private UserRatting getUserRattingFallBack(String userId) {
		return new UserRatting(Arrays.asList(new Rating("123","5")));
	}
}
