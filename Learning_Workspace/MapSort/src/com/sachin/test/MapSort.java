package com.sachin.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> mapValue = new HashMap<>();
		mapValue.put(100, "sachin");
		mapValue.put(20, "Anand");
		mapValue.put(8, "lax");
		mapValue.put(2, "swati");
		mapValue.put(10000, "sachin");
		
		System.out.println("****************Map.Entry<>**************");
		for(Map.Entry<Integer, String> entry : mapValue.entrySet()) {
			System.out.println("Key -> " + entry.getKey()
							+  " Value -> " + entry.getValue());
			
		}
		
		System.out.println("*******************keySet()********************");
		
		for(int key : mapValue.keySet()) {
			System.out.println("Key -> " + key
			+  " Value -> " + mapValue.get(key));
		}
		
		System.out.println("*****************Itrator*****************");
		
		Iterator itr = mapValue.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer, String> entry = (Entry<Integer, String>) itr.next();
			System.out.println("Key -> " + entry.getKey()
							+  " Value -> " + entry.getValue());
		}
		
		System.out.println("****************Using For Each*******************");
		mapValue.forEach((k,v) ->System.out.println("Key -> " + k
												+  " Value -> " + v));
		
		System.out.println("****************Sorting the Map by value and displaying****************");
		mapValue.entrySet()
				.stream()
				.sorted(Map.Entry.<Integer,String>comparingByValue())
				.forEach(System.out::println);
		
		System.out.println("****************Sorting the Map by key and displaying****************");
		mapValue.entrySet()
				.stream()
				.sorted(Map.Entry.<Integer,String>comparingByKey())
				.forEach(System.out::println);
		
		System.out.println("****************Sorting the Map by value descending order and displaying****************");
		mapValue.entrySet()
				.stream()
				.sorted(Map.Entry.<Integer,String>comparingByValue().reversed())
				.forEach(System.out::println);
		
		System.out.println("****************Sorting the Map by key descending order and displaying****************");
		mapValue.entrySet()
				.stream()
				.sorted(Map.Entry.<Integer,String>comparingByKey().reversed())
				.forEach(System.out::println);
		
		Map<Integer,String> sortMapValue = mapValue.entrySet()
				.stream()
				.sorted(Map.Entry.<Integer,String>comparingByValue())
				//.collect(toMap(Map.Entry:: getKey,
				//				Map.Entry:: getValue,(e1,e2)->e1,LinkedHashMap:: new));
				.collect(Collectors.toMap(Map.Entry::getKey,
			               Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		
		System.out.println("**********************Sorting the Map value asc****************************");
		sortMapValue.forEach((k,v) -> System.out.println(" Key -> " + k
													+ "Value ->" + v));
		
		Map<Integer,String> sortMapKey = mapValue.entrySet()
				.stream()
				.sorted(Map.Entry.<Integer,String>comparingByKey().reversed())
				//.collect(toMap(Map.Entry:: getKey,
				//				Map.Entry:: getValue,(e1,e2)->e1,LinkedHashMap:: new));
				.collect(Collectors.toMap(Map.Entry::getKey,
			               Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		
		System.out.println("**********************Sorting the Map Key desc****************************");
		sortMapKey.forEach((k,v) -> System.out.println(" Key -> " + k
													+ "Value ->" + v));
	}

}
