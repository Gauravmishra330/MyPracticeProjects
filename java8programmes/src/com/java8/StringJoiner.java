package com.java8;

public class StringJoiner {

	public static void main(String[] args) {
		
		StringJoiner stj=new StringJoiner(",");
		
		// separated the elements with a comma in between.
		
		stj.add("Saket");
		stj.add("John");
		stj.add("Franklin");
		stj.add("Ricky");
		stj.add("Trevor");
		
		// Added elements into StringJoiner "stj"
		
		System.out.println(stj);
		
		
		
		

	}

}
