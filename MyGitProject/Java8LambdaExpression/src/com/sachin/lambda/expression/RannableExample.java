package com.sachin.lambda.expression;

public class RannableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new Thread( new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Printable in the runnable");
			}
		});
		
		thread.run();
		
		Thread mylambdaThread = new Thread( () -> System.out.println("Printable in the runnable in lambda function"));
		mylambdaThread.run();
	}

}
