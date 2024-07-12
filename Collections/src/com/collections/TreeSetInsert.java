package com.collections;

import java.util.TreeSet;

public class TreeSetInsert {

	public static void main(String[] args) {
		
		TreeSet<Integer> evenNumbers=new TreeSet<>();
		
		// Using the add() method
		
		evenNumbers.add(2);
		evenNumbers.add(2);
		evenNumbers.add(2);
		
		System.out.println("TreeSet: "+evenNumbers);
		
		TreeSet<Integer> numbers=new TreeSet<>();
		numbers.add(1);
		
		// Using the addAll() method
		
		numbers.addAll(evenNumbers);
		System.out.println("New TreeSet:"+numbers);
		
		
		
	}

}
