package com.Oops;

// Java program to demonstrate working of interface

import java.io.*;
// A simple interface

interface In1 {
	
	// public,static and final
	final int a=10;
	
	// public and abstract
	void display1();


// A class that implements the interface.




	// Implementing the capabilities of
	// interface.
	
	public default display() {
		System.out.println("Geek");
	}

	public static void main(String[] args) {
		TestClass t=new TestClass();
		t.display();
		System.out.println(a);
	}

	public void display1() {
		// TODO Auto-generated method stub
		
	}

}
