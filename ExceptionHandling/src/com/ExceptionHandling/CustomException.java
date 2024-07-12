package com.ExceptionHandling;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomException extends Exception {
	
	public CustomException(String message) {
		
		super(message);
	}



	
	ArrayList<String> languages=new ArrayList<>(Arrays.asList("java","python","javaScript"));

	public void checkLanguage(String language) throws CustomException
	{
		
		if(languages.contains(language)) {
			throw new CustomException(language + "already exists");
			
		}
		
		else {
			// insert language to ArrayList
			language.add(language);
			System.out.println(language + " is added to the ArrayList");
			
		}
	}
	
	
	public static void main(String[] args) {
		Main obj=new Main();
		
		try {
			obj.checkLanguage("Swift");
			obj.checkLanguage("Java");
		}
		
		catch(CustomException e) {
			System.out.println("["+e+"] Exception Occured");
		}
		
		

	}

}
