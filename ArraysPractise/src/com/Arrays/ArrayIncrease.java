package com.Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayIncrease {

	public static void main(String[] args) {
		
		ArrayList<String> Stringslist=new ArrayList<String>(3);
		
		Stringslist.add("Audi");
		Stringslist.add("BMW");
		Stringslist.add("Bugatti");
		
		System.out.println("Original array list:"+Stringslist);
		
		//Increase capacity to 7
		
		Stringslist.ensureCapacity(7);
		Stringslist.add("Ford");
		Stringslist.add("Honda");
		Stringslist.add("Hyundai");
		Stringslist.add("Ferrari");
		
		System.out.println("New Increased array list: "+Stringslist);
		
		
		
	}

}
