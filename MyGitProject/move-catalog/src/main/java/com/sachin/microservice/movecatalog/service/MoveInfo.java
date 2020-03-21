package com.sachin.microservice.movecatalog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.sachin.microservice.movecatalog.Move;
import com.sachin.microservice.movecatalog.Rating;

@Service
public class MoveInfo {
	@Autowired
	private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod="getMoveFallBack")
	public Move getMove(Rating rating) {
		return restTemplate.getForObject("http://localhost:8090/moveinfo/" + rating.getMoveId(), Move.class);
	}
	
	private Move getMoveFallBack(Rating rating) {
		return new Move("123","titanic");
	}
}
