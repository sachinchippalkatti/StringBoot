package com.example.sachin.RestServiceDemo.autowired;

import org.springframework.stereotype.Service;

@Service
public class Dog implements Animal {

	@Override
	public String charatertices() {
		// TODO Auto-generated method stub
		System.out.println("Bark");
		return "Bark";
	}

}
