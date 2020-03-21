package com.sachin.spring.SpringXmlConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Engine {
	
	@Autowired
	Tyre tyre;

	public void running() {
		System.out.println("Engine running" + tyre);
	}
}
