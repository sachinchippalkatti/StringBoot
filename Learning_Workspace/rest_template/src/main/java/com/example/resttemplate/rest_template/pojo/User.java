package com.example.resttemplate.rest_template.pojo;

import java.util.Map;

public class User {

	private Integer userId;
	private String name;
	private String last;
	private String birthDate;
	private Map<String, String> setting;
	private String createdOn;

	public Integer getUserId() {
	return userId;
	}

	public void setUserId(Integer userId) {
	this.userId = userId;
	}

	public String getName() {
	return name;
	}

	public void setName(String name) {
	this.name = name;
	}

	public String getLast() {
	return last;
	}

	public void setLast(String last) {
	this.last = last;
	}

	public String getBirthDate() {
	return birthDate;
	}

	public void setBirthDate(String birthDate) {
	this.birthDate = birthDate;
	}

	public String getCreatedOn() {
	return createdOn;
	}

	public void setCreatedOn(String createdOn) {
	this.createdOn = createdOn;
	}

	public Map<String, String> getSetting() {
		return setting;
	}

	public void setSetting(Map<String, String> setting) {
		this.setting = setting;
	}
	
	

}
