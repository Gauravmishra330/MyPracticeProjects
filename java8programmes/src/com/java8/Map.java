package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Map {

	public static void main(String[] args) {
		
		List<String> Names=Arrays.asList("Saket","Trevor","Franklin","Michael");
		
		List<String> UpperCase=Names.stream().map(String::toUpperCase).collect(Collectors.toList());
		
		// Changed the characters into upper case after converting it into Stream
		
		UpperCase.forEach(System.out::println);
		
		// printed using forEach Terminal Operation

	}

}
