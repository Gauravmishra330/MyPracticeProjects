package com.inteviewPrograms;

import java.util.List;

//Find the max value from list of integer 

public class FindMaxValue {

	
		int[] list= {10,15,8,49,25,98,98,32,15};
		
		int max=list.stream().mapToint(Integer::intValue).max().getAsInt();
		 Sop(max);
		
		
		

	}



