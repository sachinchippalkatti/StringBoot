package com.sachin.spring.SpringClassConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
	
	@Autowired
	public Processer process;
	
	public void getConfig() {
		System.out.println("Supper configuration" + process);
	}

}
