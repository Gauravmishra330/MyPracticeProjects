package com.collections;
import java.util.*;

public class HashMapSortByKey {

	public static void main(String[] args) {
		
		// Creating a HashMap of int Keys and String values
		
		HashMap<Integer, String> hashmap=new HashMap<Integer,String>();
		
		// Adding key and Value pairs to HashMap
		
		hashmap.put(22, "A");
		hashmap.put(55, "B");
		hashmap.put(33,"z");
		
		System.out.println("Before Sorting");
		Set set=hashmap.entrySet();
		Iterator iterator=set.iterator();
		
		while(iterator.hasNext()) {
			
			Map.Entry pair=(Map.Entry)iterator.next();
			System.out.println(pair.getKey()+":");
			System.out.println(pair.getValue());
		}
	}

}
