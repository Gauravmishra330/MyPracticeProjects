package java8practise;

import java.util.*;
import java.util.stream.*;

public class NumberStartingwithOne {

	public static void main(String[] args) {
		
		List<Integer> myList=Arrays.asList(10,15,8,49,25,98,32);
		
		myList.stream()
		
		.map(s->s+"") //Conver integer to string
		.filter(s->s.startsWith("1"))
		.forEach(System.out::println);
		
	}

}
