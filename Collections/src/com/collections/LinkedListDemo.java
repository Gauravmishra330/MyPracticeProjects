package com.collections;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList l1=new LinkedList();
		l1.add("January");
		l1.add("March");
		l1.add("May");
		l1.add("July");
		
		System.out.println(l1);
		
		System.out.println("Size of the linked list: "+l1.size());
		System.out.println("Is LinkedList empty?" +l1.isEmpty());
		System.out.println("Does LinkedList contains 'September'? "+l1.contains("september"));
		
	
	}

}
