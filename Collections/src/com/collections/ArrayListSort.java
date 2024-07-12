package com.collections;

import java.lang.reflect.Array;
import java.util.Collections;

public class ArrayListSort {

	public static void main(String[] args) {
		ArrayList arraylist=new ArrayList<Student>();
		
		arraylist.add(new Student(111,"John",23));
		arraylist.add(new Student(222,"Messi",29));
		arraylist.add(new Student(333,"Ronaldo",31));
		
		Collections.sort(arraylist);
		
		for(Student str:arraylist) {
			System.out.println(str);
		}
		
		
	}

}
