package com.java8;

@FunctionalInterface
interface MyInterface {
	
	// abstract method
	String reverse(String n);
}

public class LambdaExpressionParameters {

	public static void main(String[] args) {
		
		// declare a reference to MyInterface
		// assign a lambda expression to the reference
		
		MyInterface ref=(str)-> {
			
			String result="";
			for(int i=str.length()-1;i>=0;i--)
				result +=str.charAt(1);
			
			return result;
		};
		
		// call the method to the interface
		System.out.println("Lambda reversed="+ref.reverse("Lambda"));
		
		

	}

}
