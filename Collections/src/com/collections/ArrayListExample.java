package com.collections;

public class ArrayListExample {

	public static void main(String[] args) {
	
		ArrayList al=new ArrayList();
		
		System.out.println("Initial size of Arraylist is "+al.size());
		
		al.add("Hai");
		al.add("Hello");
		
		System.out.println("Arraylist is "+al);
		System.out.println("New size of Arraylist is "+al.size());
		al.add(1,"How are you");
		System.out.println("New Arraylist is "+al);
		System.out.println("New size of Arraylist is "+al.size());
		
		return null;

		
	}

}
