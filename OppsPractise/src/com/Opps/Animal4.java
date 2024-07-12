package com.Opps;

public class Animal4 {
	
	String color="white";
}

class Dog extends Animal{
	
	String color="black";
	
	void print Color() {
		
		System.out.println("color");
		
		System.out.println(super.color);
	}
}

class TestSuper1 {

	public static void main(String[] args) {
		Dog d=new Dog();
		
		d.printColor();
		
	}

}
