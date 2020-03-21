package com.sachin.test;

//The Fibonacci series is defined as F( N ) = F(N-1) + F(N-2)
//The series of N starts with 0, and F(0) == F(1) == 1
//Hence the Fibonacci series is: 1,1,2,3,5,8,13,....

//Write a method fib( n ) which returns the nth Fibonacci Number where n is a natural number (non-negative integer)
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =50;
		//System.out.println(fib(n));
		System.out.println(fib1(n));
	}

	private static int fib(int n) {
		if(n<=1)
			return 1;
		return fib(n-1) + fib(n-2);
	}
	
	private static int fib1(int n) {
		int f[] = new int[n+2];
		f[0] = 0;
		f[1] = 1;
		for(int i = 2; i<=n;i++) {
			f[i] = f[i-1] + f[i-2];
		}
		return f[n];
	}

}
