package com.example.sachin.RestServiceDemo.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//@ControllerAdvice
@RestControllerAdvice
public class ExceptionHandlerControllerAdvice {

	@ExceptionHandler(NoPersonException.class)
	@ResponseStatus(value=HttpStatus.NOT_FOUND)
	//@ResponseBody
	public ExceptionResponse handlerNoPersonException(NoPersonException exception,HttpServletRequest request) {
		
		String errorMessage =exception.getMessage();
		String requestURI = request.getRequestURI();
		StackTraceElement stack = exception.getStackTrace()[0];
		ExceptionResponse er = new ExceptionResponse(errorMessage, requestURI, stack);
		return er;
	}
	
	@ExceptionHandler(Exception.class)
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	//@ResponseBody
	public ExceptionResponse handlerGenericException(Exception exception,HttpServletRequest request) {
		
		String errorMessage =exception.getMessage();
		String requestURI = request.getRequestURI();
		StackTraceElement stack = exception.getStackTrace()[0];
		ExceptionResponse er = new ExceptionResponse(errorMessage, requestURI, stack);
		return er;
	}
}
