package com.sachin.kafka.KafkaExample.pojo;

public class User {

	private String name;
	private String last;
	private int age;
	
	public User() {
		
	}
	
	public User(String name, String last, int age) {
		super();
		this.name = name;
		this.last = last;
		this.age = age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
	
	
}
