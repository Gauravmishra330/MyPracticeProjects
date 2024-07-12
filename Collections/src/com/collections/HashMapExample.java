package com.collections;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap hm=new HashMap();
		
		hm.put("1", "FIRST");
		hm.put("2", "SECOND");
		hm.put("3",  "THIRD");
		
		hm.put("4",null);
		hm.put(null,"FIFTH");
		
		System.out.println("hashmap is" +hm);
		System.out.println("Value of 1: "+hm.get("1"));
		
		System.out.println("Is Hashmap empty?" +hm.isEmpty());
		
		hm.remove("2");
		
		System.out.println("After removal process, the hashmap is "+hm);
		
		System.out.println("Size of the HashMap: "+hm.size());

	}

}
