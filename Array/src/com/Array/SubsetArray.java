package com.Array;

import java.util.Arrays;
import java.util.List;

public class SubsetArray {
	
	int[] a1= {1,2,4,5};
	int[] a2= {2,5,9,11};
	
	// need to find subset array here
	
	int[] findSubSet(int a1[],int a2[]) {
		
		List<int[]> l1=Arrays.asList(a1);
		List<Integer> l2=Arrays.asList(a2);
		
		List<Integer>subset=new ArrayList<>();
		for(int i: 11) 
		{
			if(l2.contains(i)) {
				subset.add(i);
			}
		}
	}
}


