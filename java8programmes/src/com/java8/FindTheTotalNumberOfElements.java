package com.java8;

import java.util.Arrays;
import java.util.List;

public class FindTheTotalNumberOfElements {

	public static void main(String[] args) {
		
		List<Integer>myList=Arrays.asList(10,15,8,49,25,92);
		
		long count=myList.stream().count();
		
		System.out.println(count);
	}

}
