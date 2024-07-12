package com.collections;

import java.util.*;

public class Vector {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("Ayush");
		v.add("Amit");
		v.add("Ashish");
	    v.add("Garima");
	    
	    Iterator<String> itr=v.Iterator();
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }
	}

	private Iterator<String> Iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	private void add(String string) {
		// TODO Auto-generated method stub
		
	}

}
