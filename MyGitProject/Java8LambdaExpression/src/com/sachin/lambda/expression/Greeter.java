package com.sachin.lambda.expression;

public class Greeter {

	public void greet(Greeting greeting) {
		//System.out.println("Hello world");
		greeting.perform();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeter greet = new Greeter();
		
		Greeting helloWorld = new HelloWorldGreeting();
		Greeting greetingFunction = () -> System.out.println("Hello world from perform lambda");
		
		
		subssss addFunction = (int a, int b) -> a+b;
		System.out.println(addFunction.add(2, 3));
		
		greet.greet(helloWorld);
		helloWorld.perform();
		greetingFunction.perform();
		
		Greeting inlineImplentation = new Greeting() {
			public void perform() {
				System.out.println("Inline implemnation of interface");
			}
		};
		
		greet.greet(greetingFunction);
		greet.greet(inlineImplentation);
		
	}
	
	interface mygeeting{
		void foo();
	}
	
	interface Myadd{
		int add(int a, int b);
	}
}

interface subssss{
	int add(int a, int b);
}
