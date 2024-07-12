package com.collections;

import java.util.HashMap;

public class HashMapSize {
        public static void main(String[] args) {
        	
       // Creating HashMap object with Integer keys and String values
        	
        	HashMap<Integer,String> map=new HashMap<>();
        	
        	// Adding elements to the hashmap object
        	
        	map.put(1, "CocoCola");
        	map.put(2, "Pepsi");
        	
        	// Calculating the size of the HashMap using size() method
        	System.out.println("Size of the given HashMap is:"+map.size());
        	
		
	}

}
