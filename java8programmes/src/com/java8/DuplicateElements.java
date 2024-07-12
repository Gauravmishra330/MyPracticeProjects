package com.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class DuplicateElements {

	public static void main(String[] args) {
	
		
		List<Integer>myList=Arrays.asList(10,15,8,49,25);
		
		HashSet set=new HashSet();
		myList.stream()
		
		.filter(n-> !set.add(n))
		.forEach(System.out::println);
		
		
		
	}

}
