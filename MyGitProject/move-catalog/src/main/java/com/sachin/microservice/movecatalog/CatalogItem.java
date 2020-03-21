package com.sachin.microservice.movecatalog;

public class CatalogItem {
	private String moveName;
	private String desc;
	private String rating;
	
	CatalogItem(){
		
	}
	
	public CatalogItem(String moveName, String desc, String rating) {
		super();
		this.moveName = moveName;
		this.desc = desc;
		this.rating = rating;
	}
	
	public String getMoveName() {
		return moveName;
	}
	public void setMoveName(String moveName) {
		this.moveName = moveName;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	
	
}
