package com.collections;

import java.util.Collections;

public class ReversingArrayList {

	public static void main(String[] args) {
		
		ArrayList<String>arraylist=new ArrayList<String>();
		
		arraylist.add("NORTH");
		arraylist.add("SOUTH");
		arraylist.add("East");
		arraylist.add("WEST");
		
		System.out.println("Arraylist is :"+arraylist); //
		Collections.reverse(arraylist);
		
		System.out.println("Reversed arraylist is : "+arraylist);
		
		
	}

}
