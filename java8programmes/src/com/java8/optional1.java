package com.java8;

public class optional1 {

	public static void main(String[] args) {
		
		String[] str=new String[10];
		Optional<Object> checkNull = Optional.ofNullable(str.length > 5 ? str[5] : null);

		if (Optional.ofNullable(checkNull).isPresent()) {
			
			String word=str[5].toLowerCase();
			System.out.print(str);
		}
		else
			System.out.println("string is null");

	}

}
