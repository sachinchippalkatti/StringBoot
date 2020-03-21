package com.sachin.mongodb.mongorepository.document;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@XmlRootElement
public class User{
	
	@Id
	private Integer userId;
	private String name;
	private String last;
	private Date birthDate = new Date();
	private Map<String, String> setting = new HashMap<>();
	private Long createdOn = new Date().getTime();
	
	
	public User() {
		
	}
	public User(Integer userId, String name, String last) {
		super();
		this.userId = userId;
		this.name = name;
		this.last = last;
	}

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

	
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public Map<String, String> getSetting() {
		return setting;
	}
	public void setSetting(Map<String, String> setting) {
		this.setting = setting;
	}
	
	
	public Date getCreatedOn() {
		return new Date(createdOn);
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn.getTime();
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [userId=");
		builder.append(userId);
		builder.append(", name=");
		builder.append(name);
		builder.append(", last=");
		builder.append(last);
		builder.append(", birthDate=");
		builder.append(birthDate);
		builder.append(", setting=");
		builder.append(setting);
		builder.append("]");
		return builder.toString();
	}
	
		
	
}
