package com.Arrays;

import java.util.*;

public class ArrayFirstPosition {

	public static void main(String[] args) {
		
		List<String> Stringslist=new ArrayList<String>();
		
		Stringslist.add("Audi");
		Stringslist.add("BMW");
		Stringslist.add("Bugatti");
		Stringslist.add("Ford");
		
		System.out.println(Stringslist);
		
		Stringslist.add(0,"Ferrari");
		Stringslist.add(7,"Flat");
		
		System.out.println(Stringslist);
		
	}

}
