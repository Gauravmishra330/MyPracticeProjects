package com.Arrays;

import java.util.*;

public class ArraySort {

	public static void main(String[] args) {
		
		List<String> Stringslist=new ArrayList<String>();
		
		Stringslist.add("Honda");
		Stringslist.add("Hyundai");
		Stringslist.add("Bugatti");
		Stringslist.add("Ford");
		Stringslist.add("Audi");
		Stringslist.add("BMW");
		
		System.out.println("List before sort:"+Stringslist);
		Collections.sort(Stringslist);
		
		System.out.println("List after sort: "+Stringslist);
	}

}
