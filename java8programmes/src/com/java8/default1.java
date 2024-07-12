package com.java8;

import java.util.Optional;
public interface default1 {
	
	default void default_method() {
		
		System.out.println("I am default method of interface");
		
		
	}
}

class derived1_class implements interface_default {
	



	public static void main(String[] args) {
	derived_class obj1=new derived_class();
	obj1.default_method();
	}

}
