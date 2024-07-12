package com.collections;

import java.lang.reflect.Array;

public class ClearArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> directionsArraylist=new ArrayList<String>();
		
		// Adding elements to arraylist
		
		directionsArraylist.add("NORTH");
		directionsArraylist.add("SOUTH");
		directionsArraylist.add("EAST");
		directionsArraylist.add("WEST");
		
		System.out.println("The arraylist is:"+directionsArraylist);
		System.out.println("The size of the arraylist is:"+directionsArraylist.size());
		
		directionsArraylist.clear();
		System.out.println("The size of the arraylist after clearing is: "+directionsArraylist.size());

	}

}
