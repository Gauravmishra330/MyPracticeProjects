package com.collections;

import java.util.Stack;
public class Stackpop {

	public static void main(String[] args) {
		Stack<String> animals=new Stack<>();
		
		// Add elements to Stack
		animals.push("Dog");
		animals.push("Horse");
		animals.push("cat");
		
		System.out.println("Initial Stack:"+animals);
		
		// Remove element stacks
        String element = animals.pop();
        System.out.println("Removed Element:" +element);
	}

}
