package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Concatenatejava8 {

	public static void main(String[] args) {
		
		List<String> list1=Arrays.asList("Java","8");
		
		List<String> list2=Arrays.aslist("explained","through","programmes");

		Stream<String> concatStream=Stream.concat(list1.stream(),list2.stream());
		
		concatStream.forEach(str -&gt; System.out.printl(str +""));
		
		
	
	}
	
	

}
