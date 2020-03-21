package com.sachin.lambda.expression;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ListUsageLambdaJava8 {

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
		Collections.sort(list, (p1,p2) -> p1.getName().compareTo(p2.getName()));
		
		// Create method to print element of list
		System.out.println("Print all the person in the list\n\n");
		printAllStartCondition(list, (p) ->true);
		
		
		// Create method to print last name starters with C
		System.out.println("Printing last name beginning with c\n\n");
		printAllStartC(list);
		
		// Create method to print last name starters with dynamic value
		System.out.println("Printing last name beginning with c dynamic way\n\n");
		printAllStartCondition(list, (p) -> p.getLastname().startsWith("c"));
				
		System.out.println("Printing name beginning with s dynamic way\n\n");
		printAllStartCondition(list, (p) -> p.getName().startsWith("s"));
		
		System.out.println("Printing name beginning with s dynamic using predicate generic class\n\n");
		printAllStartPredicate(list, (p) -> p.getName().startsWith("s"), (p) -> System.out.println(p.getName()));
		
		System.out.println("Printing the list using forEach");
		list.forEach(System.out::println);
		
		System.out.println("Printing the list using streams");
		list.stream()
		.forEach(System.out::println);
		
		System.out.println("Printing the list using streams and filtering with condition");
		list.stream()
		.filter(p-> p.getName().startsWith("s"))
		.forEach(System.out::println);
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
	
	private static void printAllStartPredicate(List<Person> list, Predicate<Person> c, Consumer<Person> consumer) {
		// TODO Auto-generated method stub
		for(Person p: list) {
			if(c.test(p)) {
				consumer.accept(p);
			}
		}
	}

	private static void printAll(List<Person> list) {
		// TODO Auto-generated method stub
		for(Person p : list)
			System.out.println(p);
	}
	
	interface Condition{
		boolean test(Person p);
	}
}


