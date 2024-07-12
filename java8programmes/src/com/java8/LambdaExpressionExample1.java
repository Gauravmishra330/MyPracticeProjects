package com.java8;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class LambdaExpressionExample1 {

	public static void main(String[] args) {
		
		shoppingList.add("Onions");
		shoppingList.add("Bread");
		shoppingList.add("Flour");
		shoppingList.add("Sugar");
		shoopingList.add("Chicken");
		
		Java8Example example=new Java8Example();
		example.sortUsingLambda(shoopingList);
		System.out.println(shoopingList);
	

	}
	
	private void sortUsingLambda(List<String> shoopingList) {
		
		Collections.sort(shoopingList,(s1,s2)->s1.compareTo(s2));
	}

	
}
