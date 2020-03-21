package com.example.sachin.RestServiceDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.sachin.RestServiceDemo.exception.NoPersonException;
import com.example.sachin.RestServiceDemo.service.PersonService;

@SpringBootApplication
public class RestServiceDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(RestServiceDemoApplication.class, args);
		PersonService personService=(PersonService) applicationContext.getBean("personService");
		try {
			System.out.println(personService.getPerson());
		} catch (NoPersonException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
