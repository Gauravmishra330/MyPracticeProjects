package com.java8;

import java.util.Arrays;
import java.util.List;

public class FindFirstElement {

	public static void main(String[] args) {
		
		List<Integer> myList=Arrays.asList(10,15,8,49,25);
		
		myList.stream()
		.findFirst()
		.ifPresent(System.out::println);
	}

}
