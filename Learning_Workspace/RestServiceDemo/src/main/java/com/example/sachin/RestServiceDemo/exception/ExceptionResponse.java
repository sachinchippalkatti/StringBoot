package com.example.sachin.RestServiceDemo.exception;

public class ExceptionResponse {
	
	String errorMessage;
	String requestURI;
	StackTraceElement stack;
	
	
	public ExceptionResponse(String errorMessage, String requestURI, StackTraceElement stack) {
		super();
		this.errorMessage = errorMessage;
		this.requestURI = requestURI;
		this.stack = stack;
	}
	
	
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getRequestURI() {
		return requestURI;
	}
	public void setRequestURI(String requestURI) {
		this.requestURI = requestURI;
	}


	public StackTraceElement getStack() {
		return stack;
	}


	public void setStack(StackTraceElement stack) {
		this.stack = stack;
	}
	
	

}
