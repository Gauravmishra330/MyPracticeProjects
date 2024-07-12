package com.String;

public class Stringreverse {

	public static void main(String[] args) {
		
	String str="Welcome to Edureka";
	String[] strArray=str.split("");
	
	for(String temp: strArray) {
		System.out.println(temp);
	}
	
	for(int i=0; i<3;i++)
	{
		char[] s1=strArray[i].toCharArray();
		{
			
			System.out.print(s1[i]);
		}
		
		System.out.print("");
	}
		
	}

}
