package com.sachin.kafka.consumer.kafkaconsumer.pojo;

public class Person  {
	private String name;
	private String last;
	
	Person(){
		
	}
	
	

	public Person(String name, String last) {
		super();
		this.name = name;
		this.last = last;
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



	@Override
	public String toString() {
		return "Person [name=" + name + ", last=" + last + "]";
	}
	
	
}
