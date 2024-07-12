package com.collections;

import java.util.*;

public class ArrayList {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();//creating arraylist
		list.add("Ravi");//Adding object in arraylist
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		
		//Traversing list through Iterator
		
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

	
	}

