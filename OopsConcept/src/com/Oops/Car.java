package com.Oops;

public class Car {
	void run()
	{
		System.out.println("&1dquo;car is running&rdquo;");
		}
}
class Audi extends Car {
	void run()
	
	{
		System.out.println("Audi is running safely with 100km");
	}

	public static void main(String[] args) {
		Car b=new Audi();
		b.run();
		
	}

}
