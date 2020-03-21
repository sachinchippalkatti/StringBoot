package com.sachin.microservice.movecatalog;

import java.util.List;

public class UserRatting {

	private List<Rating> userRatting;
	
	UserRatting(){
		
	}

	public UserRatting(List<Rating> userRatting) {
		super();
		this.userRatting = userRatting;
	}

	public List<Rating> getUserRatting() {
		return userRatting;
	}

	public void setUserRatting(List<Rating> userRatting) {
		this.userRatting = userRatting;
	}
	
	
}
