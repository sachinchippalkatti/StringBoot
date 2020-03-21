package com.sachin.microservice.moveinfo;

public class Move {
	private String moveId;
	private String name;
	
	
	public Move(String moveId, String name) {
		super();
		this.moveId = moveId;
		this.name = name;
	}
	
	public String getMoveId() {
		return moveId;
	}
	public void setMoveId(String moveId) {
		this.moveId = moveId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
