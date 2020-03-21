package com.sachin.spring.SpringClassConfiguration;

import org.springframework.stereotype.Component;

@Component
public class Processer {

	private String type;
	
	Processer(){
		this.type="intel";
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Processer [type=" + type + "]";
	}
	
}
