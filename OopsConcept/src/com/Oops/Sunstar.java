package com.Oops;

public abstract class Sunstar {
	
	abstract void printInfo();
}

// Abstraction performed using extends
class Employee extends Sunstar {
	void printInfo() 
	{
		String name="Gaurav";
		int age=26;
		float salary=222.2F;
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(salary);
	}
	
	//Base class
	class Base {
	public static void main(String[] args) {
		
		Sunstar s=new Employee();
		s.printInfo();
	}
		
	}

}
