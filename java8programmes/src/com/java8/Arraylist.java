package com.java8;
import java.util.ArrayList;
import java.util.List;


public class Arraylist {
	public static void main(String[] args) {
		List<String> sublist=new ArrayList<String>();
		sublist.add("Carrot");
		sublist.add("potato");
		sublist.add("cauliflower");
		sublist.add("LadyFinger");
		sublist.add("Tomato");
		
		System.out.println("---Vegetable List---");
		sublist.forEach(sub -> System.out.println(sub));
	}

}
