package com.mysql.connection.serviceMysql.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sockect")
public class SockectExceptionController {
	
	@GetMapping("/exp/{number}")
	public String getFindonicNumber(@PathVariable final int number) {
		int value = fidonicyNumber(number);
		return "sucess : " + value;
	}

	private int fidonicyNumber(int number) {
		// TODO Auto-generated method stub
		if(number ==0 || number == 1)
			return 1;
		else
			return fidonicyNumber(number-1) + fidonicyNumber(number-2);
	}

}
