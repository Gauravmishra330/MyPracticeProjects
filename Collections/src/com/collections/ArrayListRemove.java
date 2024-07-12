package com.collections;

public class ArrayListRemove {

	public static void main(String[] args) {
		
		ArrayList<List>animals=new ArrayList();
		
		// add elements in the array list
		
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Horse");
		
		System.out.println("Arraylist:" +animals);
		
		
		// remove element from index 2
		
		String str=animals.remove(2);
		System.out.println("Updated ArrayList:"+animals);
		System.out.println("Removed Element:"+str);
		
	}

}
