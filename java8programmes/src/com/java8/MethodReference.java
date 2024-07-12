package com.java8;

import java.sql.Ref;
import java.util.Optional;

public interface MyInterface {
	
	void display();
}

public class MethodReference {
	
	public void classMethod() {
		System.out.println("Derived class method");
	}



public static void main(String[] args) {
	
	MethodReference obj1=new MethodReference();
	
	Ref.display();
}
	
}

