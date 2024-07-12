package com.Oops;

// java program to illustrate Abstract class
//withod any abstract method

// Class 1
// An abstract class withod any abstract method



public abstract class Base2 {
	//Demo method.This is not an abstract method.
	
	void fun()
	{
		// print message if class 1 function is called
		System.out.println("Function of Base class is called");
	}
}

// Class 2
class Main {
	
	// Main driver method

	public static void main(String[] args) {
		// Creating object of class 2
		Derived d=new Derived();
		
		d.fun();
		

	}

}
