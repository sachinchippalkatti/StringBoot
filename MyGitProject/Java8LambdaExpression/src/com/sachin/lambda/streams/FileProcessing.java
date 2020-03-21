package com.sachin.lambda.streams;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileProcessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename = "c://sachin/Lines.txt";
		
		List<String> list = new ArrayList();
		List<String[]> sublist = new ArrayList<String[]>();
		
		
		try(Stream<String> stream = Files.lines(Paths.get(filename))){
			list = stream
					.filter(line -> !line.startsWith("line3"))
					.map(String::toUpperCase)
					.collect(Collectors.toList());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	sublist =list.stream()
				.map(str->str.split("\\|"))
				.collect(Collectors.toList());
		
	for(String[] str: sublist)
		System.out.println(str[4]);
	
	System.out.println("inside the file");
	list.forEach(System.out::println);
	}
	
}
