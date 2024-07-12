package com.collections;

import java.util.HashMap;
public class RemoveHashMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> languages=new HashMap<>();
		
		languages.put(1, "java");
		languages.put(2, "python");
		languages.put(3, "javaScript");
		
		System.out.println("HashMap:" +languages);
		
		// remove element associated with Key 2
		String value = languages.remove(2);
		System.out.println("Removed value:"+value);
		
		System.out.println("Updated HashMap:"+languages);
	}

}
