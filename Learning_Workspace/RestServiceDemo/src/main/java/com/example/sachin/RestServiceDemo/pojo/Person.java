package com.example.sachin.RestServiceDemo.pojo;

public class Person {
	private String name;

	public Person() { // default constructor is must required because serialization and deserialization is done using the same
		
	}
	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
