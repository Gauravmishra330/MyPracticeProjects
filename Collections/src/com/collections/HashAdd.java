package com.collections;

import java.util.*;

public class HashAdd {
  public static void main(String[] args) {
	  
	  // initialize HashSet
	  HashSet<Integer> hs=new HashSet<Integer>();
	  
	  // Add elements to hashset object
	  
	  hs.add(3);
	  hs.add(17);
	  hs.add(6);
	  
	  System.out.println("Using Advanced for loop");
	  
	  // printing hashset
	  
	  for(Integer num: hs) {
		  System.out.println(num);
	  }
		

	}

}
