package com.inteviewPrograms;

import java.util.HashMap;
import java.util.Iterator;

public class Iteratingjavaiterator {
	
	public static void main(String args[])
	
	{
		
		// HashMap with Country as key and Player as value
		HashMap<String,String>map=new HashMap<String,String>();
		map.put("India,Sachin", null);
		map.put("Australia", "Ricky Pointing");
		
		// Iterating java iterator
		
		System.out.println("Iterating java Iterator");
		Iterator<String> countryKeySetIterator=map.keySet().iterator();
		while(countryKeySetIterator.hasNext()) {
			
			String countryKey=countryKeySetIterator.next();
			map.put("West Indies", "Brain Lara");
			System.out.println(countryKey);
			
			
			
			
		}
		
		System.out.println("--------");
		
	}

}
