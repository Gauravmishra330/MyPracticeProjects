package com.collections;

import java.io.*;
import java.util.*;

public class IteratorExample {

	public static void main(String[] args)
	{
		
		ArrayList<String> names=new ArrayList<String>();
		
		names.add("Gaurav");
		names.add("Sunil");
		names.add("Anil");
		names.add("Sania");
		names.add("Nirmal");
		
		// Iterator to iterate the cityNames
		
		Iterator iterator=names.iterator();
		System.out.println("Names elements:");
		
		while(iterator.hasNext())
			
			System.out.println(iterator.next()+""
		

	}

}
