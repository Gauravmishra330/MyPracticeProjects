package com.opps;

public class MethodoverloadingAdder {
	
	static int add(int a, int b)
	{
		return a+b;
	}
	
	static double add (double a,double b)
	{
		return a+b;
	}

	public static void main(String[] args)
	{
		
		System.out.println(MethodoverloadingAdder.add(11,11));
		System.out.println(MethodoverloadingAdder.add(12.3,12.6));
		
		
	}

}
