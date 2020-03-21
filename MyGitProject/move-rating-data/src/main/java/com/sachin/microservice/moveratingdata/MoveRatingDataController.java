package com.sachin.microservice.moveratingdata;


import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rating")
public class MoveRatingDataController {

	@GetMapping("/{moveId}")
	public Rating getMovieRating(@PathVariable String moveId) {
		return new Rating("123", "5");
	}
	
	@GetMapping("byuser/{userId}")
	public UserRatting getMovieRatingByUserId(@PathVariable String userId) {
		List<Rating> rating= Arrays.asList(
				new Rating("123", "5"),
				new Rating("111", "4"),
				new Rating("342", "1"));
		
		UserRatting userRating = new UserRatting();
		userRating.setUserRatting(rating);
		return userRating;
	}
}
