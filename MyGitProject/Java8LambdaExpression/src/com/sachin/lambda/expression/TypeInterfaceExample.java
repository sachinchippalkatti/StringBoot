package com.sachin.lambda.expression;

public class TypeInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringLength getLenght = s -> s.length();
		System.out.println(getLenght.getStringLength("Hello world"));
		
	}
	
	interface StringLength{
		int getStringLength(String s);
	}

}
