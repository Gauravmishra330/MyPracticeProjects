package com.Oops;

//Class 1

public abstract class Base1 {
	abstract void fun();
}

// Class2
class Derived extends Base1
{
	void fun()
	{
		System.out.println("Dervied fun() called");
	}
}

// Class 3
// Main class

class Main {
	
	// Main driver method
     public static void main(String[] args)
     {
    	 // We can have references of Base type.
    	 Derived b=new Derived();
    	 b.fun();
		

	}

}
