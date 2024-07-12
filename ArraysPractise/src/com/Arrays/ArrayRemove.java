package com.Arrays;

import java.util.*;

public class ArrayRemove {

	public static void main(String[] args) {
		
		List<String> listStrings=new ArrayList<String>();

		listStrings.add("Audi");
		listStrings.add("BMW");
		listStrings.add("Bugatti");
		listStrings.add("Ford");
		
		
		System.out.println(listStrings);
		
		// Removing the third element from the list.
		
		listStrings.remove(2);
		
		System.out.println("After removing third element from the list:\n"+listStrings);
		
		
	}

}
