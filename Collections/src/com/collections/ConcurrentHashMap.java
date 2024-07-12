package com.collections;

import java.util.HashMap;

public class ConcurrentHashMap {

	public static void main(String[] args) {
		
		// Creating a hashmap of even numbers
		
		HashMap<String, Integer> evenNumbers=new HashMap<>();
		evenNumbers.put("Two", 2);
		evenNumbers.put("Four", 4);
		
		System.out.println("HashMap: "+ evenNumbers);
		
		// Creating a concurrent hashmap from other map
		
		ConcurrentHashMap numbers=new ConcurrentHashMap(evenNumbers);
		
		ConcurrentHashMap number.put("Three",3);
		System.out.println("ConcurrentHashMap:"+number);

	}

}
