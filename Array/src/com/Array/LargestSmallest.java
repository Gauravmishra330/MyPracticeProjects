package com.Array;

import java.util.*;

public class LargestSmallest {

	public static void main(String[] args) {
		
		int[] inputArray= {10,20,22,30,77};
		int largest=inputArray[0];
		int smallest=inputArray[0];
		
		for( int number:inputArray) {
			if(number>largest) {
				largest=number;
				
			}
			
			else if(smallest>number) {
				smallest=number;
				
				
			}
		}
		
		System.out.println("Largest and Smallest numbers are" +largest+" "+smallest);
		
	}

}
