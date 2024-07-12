package com.inteviewPrograms;

public class Findmissingnumber {
	
	Arrays.sort(a);
	for(int i=0;i<a.length; i++) {
		
		if(a[i+1]-a[i] !=1) {
			
			System.out.println("missing number is"+a[i]+1);
		}
	}

}
