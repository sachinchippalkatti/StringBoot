package com.sachin.microservice.moveratingdata;

public class Rating {
	private String moveId;
	private String rating;
	
	
	public Rating(String moveId, String rating) {
		super();
		this.moveId = moveId;
		this.rating = rating;
	}
	
	public String getMoveId() {
		return moveId;
	}
	public void setMoveId(String moveId) {
		this.moveId = moveId;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	
	

}
