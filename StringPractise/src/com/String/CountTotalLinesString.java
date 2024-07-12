package com.String;

public class CountTotalLinesString {
	
	public static int getLineCount(String text) {

		return text.split("[\n|\r]").length;
		

	}
	
	public static void main(String[] args) {
		
		String str="line1\nline2\nline3\rline4";
		
		int count=getLineCount(str);
		
		System.out.println("Total Line count: "+count);
	}
		
	
	
	

}
