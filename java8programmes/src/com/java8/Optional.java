package com.java8;
public class Optional {
	
	public static void main(String[] args) {
		
		String[] str = new String[10];
		Object OptionalcheckNull = Optional.ofNullable(str[5]);
		
		if (checkNull.isPresent()) {
			String word = str[5].toLowerCase();
			System.out.print(str);
			 }
		else
			
			System.out.println("string is null");
		
	}

	static Object ofNullable(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
