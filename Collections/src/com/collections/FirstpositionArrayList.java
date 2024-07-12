package com.collections;

import java.util.List;

public class FirstpositionArrayList {

	public static void main(String[] args) {
		
		
  ArrayList list_Strings=new ArrayList();
  
  list_Strings.add("Red");
  list_Strings.add("Green");
  list_Strings.add("White");
  
  list_Strings.add("Black");
  
  // Print the list
  System.out.println(list_Strings);
  
  // Now insert a color at the first and last position of the list
  
  list_Strings.add(0, "pink");
  list_Strings.add(5, "Yellow");
  
  // Print the list
  
  System.out.println(list_Strings);
  
		
	}

}
