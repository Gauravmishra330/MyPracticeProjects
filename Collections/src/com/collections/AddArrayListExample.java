package com.collections;

import java.util.*;
import java.util.ArrayList;
public class AddArrayListExample {

	public static void main(String[] args) {
		
		// Declaration of String ArrayList
		ArrayList<String> al=new ArrayList<String>();
		
		/* Simple add() method for adding element at the 
		 * end of the ArrayList*/
		 
		al.add("California");
		al.add("Boston");
		al.add("San jose");
		al.add("New York");
		
		// Adding element to the 3rd position
		//3rd position=2 index as index starts with 0
		
		al.add(2,"San Francisco");
		System.out.println("ArrayList after adding String San Francisco"+al);
		
		//Addition of String Element at 1st position
		al.add(0,"Texas");
		
		//Displaying the ArrayList
		System.out.println("ArrayList after adding String Texas:"+al);
		
	}

}
