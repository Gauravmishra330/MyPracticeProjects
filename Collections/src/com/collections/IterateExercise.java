package com.collections;

import java.util.List;

public class IterateExercise {

	public static void main(String[] args) {
		
		ArrayList list_Strings=new ArrayList<String>();
		
		list_Strings.add("Red");
		list_Strings.add("Green");
		list_Strings.add("Orange");
		list_Strings.add("White");
		
		// print the list
		
		for (String element: list_Strings) {
			
			System.out.println(element);
		}
			
		}

}
