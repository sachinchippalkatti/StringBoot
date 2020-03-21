package com.sachin.lambda.expression;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListUsageLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> list = Arrays.asList(
				new Person("sachin","chippalkatti",23),
				new Person("Anish","chippalkatti",213),
				new Person("Anand","chippalkatti",93),
				new Person("gun","chippalkatti",27),
				new Person("raju","chippalkatti",123)
				);
		
		// sort the list by first name
		Collections.sort(list, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
			
		});
		
		// Create method to print element of list
		System.out.println("Print all the person in the list\n\n");
		printAll(list);
		
		
		// Create method to print last name starters with C
		System.out.println("Printing last name beginning with c\n\n");
		printAllStartC(list);
		
		// Create method to print last name starters with dynamic value
		System.out.println("Printing last name beginning with c dynamic way\n\n");
				printAllStartCondition(list, new Condition() {
					
					@Override
					public boolean test(Person p) {
						// TODO Auto-generated method stub
						return p.getLastname().startsWith("c");
					}
				});
				
				System.out.println("Printing name beginning with s dynamic way\n\n");
				printAllStartCondition(list, new Condition() {
					
					@Override
					public boolean test(Person p) {
						// TODO Auto-generated method stub
						return p.getName().startsWith("s");
					}
				});
	}

	private static void printAllStartC(List<Person> list) {
		// TODO Auto-generated method stub
		for(Person p: list) {
			if(p.getLastname().startsWith("c")) {
				System.out.println(p);
			}
		}
	}
	
	private static void printAllStartCondition(List<Person> list, Condition c) {
		// TODO Auto-generated method stub
		for(Person p: list) {
			if(c.test(p)) {
				System.out.println(p);
			}
		}
	}

	private static void printAll(List<Person> list) {
		// TODO Auto-generated method stub
		for(Person p : list)
			System.out.println(p);
	}

}

interface Condition{
	boolean test(Person p);
}
