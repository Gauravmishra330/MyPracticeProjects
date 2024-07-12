package com.inteviewPrograms;

public class Anagrams {

	String s1="abc";
	String s2="bca";
	
	char[] a1[]=s1.toCharArray();
	char[] a2[]=s2.toCharArray();
	
	Array.sort(a1);
	Array.sort(a2);
	
	if(Arrays.equals(a1,a2)) {
		
		Sop("bothare same chars or anagrams");
	}
	else {
		Sop("not same");
	}
}
