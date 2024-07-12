package com.java8;

@FunctionalInterface

interface Test{
	
	int calculate(int x);
}
public class Square {

	public static void main(String[] args) 
	{
		
		int a=5;
		
		// lambda expression to define the calculate method
		
		Square s= (int x) -> x * x;
		
		// parameter passed and return type must be
		//same as defined in the prototype
		
		int ans=s.calculate(a);
		System.out.println(ans);
		
		
		

	}

	private int calculate(int a) {
		// TODO Auto-generated method stub
		return 0;
	}

}
