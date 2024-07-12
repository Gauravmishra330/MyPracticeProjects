package com.collections;

import java.util.*;
import java.util.concurrent.*;

public class ConcurrentMap {

	public static void main(String[] args) {
		
		ConcurrentMap<String,Integer> mymap=new ConcurrentMap<String,Integer>();
		
		mymap.put("AAA",10);
		mymap.put("BBB",15);
		mymap.put("CCC",25);
		mymap.put("DDD",255);
		
		System.out.println("Mappings are:"+mymap);
		
		System.out.println("is 255 present? ::"+ mymap.containsValue(255));


	}

}
