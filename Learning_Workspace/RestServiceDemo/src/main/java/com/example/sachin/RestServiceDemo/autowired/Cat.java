package com.example.sachin.RestServiceDemo.autowired;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class Cat implements Animal {

	@Override
	public String charatertices() {
		// TODO Auto-generated method stub
		System.out.println("CAT");
		return "CAT";
	}

}
