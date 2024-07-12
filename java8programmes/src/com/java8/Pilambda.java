package com.java8;
import java.lang.FunctionalInterface;


@FunctionalInterface
interface MyInterface {
	
	// abstract method
	double getPiValue();
	
}

public class Pilambda {

	public static void main(String[] args) {
	
		// declare a reference to MyInterface
		MyInterface ref;
		
		// lambda expression
		ref=()->3.1415;
		
		
		System.out.println("Value of Pi="+ref.getPiValue());
		
		
	}

}
