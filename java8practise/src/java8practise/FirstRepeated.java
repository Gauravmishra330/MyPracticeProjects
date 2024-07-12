package java8practise;

import java.util.*;
import java.util.stream.*;

import java.util.funtion.Function;


public class FirstRepeated {

	public static void main(String[] args) {
		
		String input="Java Articles are Awesome";
		
		Character result=input.chars()  // Stream of String
				
				.mapToObj(s-> Character.toLowerCase) 
  .collect(Collectors.groupingBy(Function.identify(), LinkedHashMap::new, Collectors.counting()))
  .entrySet()
  .stream()
  .filter(entry-> entry.getValue(>1L))
  
  .map(entry-> entry.getValue())
  
  .findFirst()
  .get();
  System.out.println(result);
  

	}

}
