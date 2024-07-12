package com.collections;

import java.util.*;

public class RetriveArrayList {

	public static void main(String[] args) {
		ArrayList list_Strings=new ArrayList
		
		list_Strings.add("Red");
		list_Strings.add("Green");
		list_Strings.add("Orange");
		list_Strings.add("White");

		// Print the list
		
		System.out.println(list_Strings);
		
		// Retrive the first and third element
		
		String element=list_Strings.get(0);
		
		System.out.println("First element: "+element);
		
		element=list_Strings.get(2);
		
		System.out.println("Third element: "+element);
		

	}

	private static void add(String string) {
		// TODO Auto-generated method stub
		
	}

}
