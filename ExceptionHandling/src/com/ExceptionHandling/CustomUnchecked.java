package com.ExceptionHandling;

import java.util.ArrayList;
import java.util.Arrays;

// create a unchecked exception class

public class CustomUnchecked extends RuntimeException {

	public CustomUnchecked(String message) {
		
		// call the constructor of RuntimeException
		Super(message);
	}

	private void Super(String message) {
		// TODO Auto-generated method stub
		
	}
	}

class Main {
	
	ArrayList<String> languages=new ArrayList<>(Arrays.asList("Java", "python","javaScript"));
	
	// check the exception condition
	
	public void checkLanguage(String language) throws CustomException {
		
		if(languages.contains(language)) {
			
			throw new CustomException(language + "already exists");
		}
	} 
	
	
	public static void main(String[] args) throws CustomException {
		// create object of Main class
		
		Main obj=new Main();
		
		// check if language already present
		obj.checkLanguage("Swift");
		obj.checkLanguage("java");
		
	}

}
