package com.collections;

import java.util.*;
public class HashMapStudent {

	public static void main(String[] args) {
		// Create a hash map
		
		HashMap<String, Integer>hm=new HashMap<String,Integer>(2);
		
		// Put elements to the map
		
		hm.put("Gaurav",new Integer(34));
		hm.put("Mahesh",new Integer(123));
		hm.put("Prakash",new Integer(137));
		
		System.out.println(hm.get("Gaurav"));
		
		// Deposit 1000 into John Doe's account.
		
		Integer oldmark=hm.get("Gaurav");
		hm.put("Gaurav", oldmark+10);
		
		System.out.println("Gaurav new marks:"+hm.get("Gaurav"));
		
	}

}
