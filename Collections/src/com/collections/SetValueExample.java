package com.collections;

public class SetValueExample {

	public static void main(String[] args) {
	
		ArrayList animalsArrayList=new ArrayList<String>();
		
		animalsArrayList.add("Lion");
		animalsArrayList.add("Tiger");
		animalsArrayList.add("Camel");
		animalsArrayList.add("Giraffee");
		animalsArrayList.add("Deer");
		animalsArrayList.add("Bear");
		
		System.out.println("Initial ArrayList is: "+ animalsArrayList);
		
	animalsArrayList.set(6,"Leopard");
	System.out.println("Arraylist after setting replacing element at position 6 is:"+ animalsArrayList);

	}

}
