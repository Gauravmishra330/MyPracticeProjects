package com.java8;


import java.util.List;

public class LambdaStream {
	
	// create an object of list using ArrayList
	static List<String> places=new List<>();

	  // preparing our data
	public static List getPlaces() {
		
		
		// add places and country to the list
		places.add("Nepal, kathmandu");
		places.add("Nepal, pokhara");
		places.add("India, Delhi");
		places.add("USA, New York");
		places.add("Africa, Nigeria");
		
		return places;
	}
	
	public static void main(String[] args) {
		
		List<String> myPlaces=getPlaces();
		System.out.println("Places from Nepal:");
		
		// Filter places from Nepal
		myPlaces.stream()
		  .filter((p)-> p.startsWith("Nepal"))
		  .map((p)->p.toUpperCase())
		  .sorted()
		  .forEach((p)-> System.out.println(p));
	}

}
