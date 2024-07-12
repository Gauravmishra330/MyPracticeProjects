package com.Arrays;

public class FindMissingNumber {
	
	public static int findMissingNumber (int[] nums,int n) {
		
		int totalSum =n*(n+1/2);
		int actualSum=0;
		
		for(int num:nums) {
			
			actualSum +=num;
		}
		
		return totalSum-actualSum;
	}
			

	public static void main(String[] args) {
		
		int[] nums = {1,2,4,6,3,7,8};
		int n=8;
		int missingNumber=findMissingNumber(nums,n);
		System.out.println("Missing Number:" +missingNumber);
		
	}

}
