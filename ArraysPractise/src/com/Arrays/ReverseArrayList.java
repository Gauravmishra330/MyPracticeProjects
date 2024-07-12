package com.Arrays;

import java.util.*;

public class ReverseArrayList {

	public static void main(String[] args) {
		
		List<String>Stringslist=new ArrayList<String>();
		
		Stringslist.add("Audi");
		Stringslist.add("BMW");
		Stringslist.add("Bugatti");
		Stringslist.add("Ford");
		Stringslist.add("Honda");
		Stringslist.add("Hyundai");
		
		System.out.println("List before reversing :\n" +Stringslist);
		
		Collections.reverse(Stringslist);
		
		System.out.println("List after reversing:\n" +Stringslist);
		
	}

}
