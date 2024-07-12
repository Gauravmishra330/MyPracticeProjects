package com.inteviewPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindSubset {
	
	int[] a1= {1,2,4,5};
	int[] a2= {2,5,9,11};
	
	//need to find subset array here
	
	int[] findSubset(int a1[],int a2[]) {
		
		List<int[]> l1=Arrays.asList(a1);
		List<int[]> l2=Arrays.asList(a2);
		List<Integer> subset= new ArrayList<>();
		
		for(int[] i: l1) {
			if(l2.contains(i)) {
				subset.add(i);
				
			}
		}
	}
	
	
	

}
