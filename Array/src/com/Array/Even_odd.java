package com.Array;

public class Even_odd {

	public static void main(String[] args) 
	{
		int num;
		int arr[]= {12,23,34,45,56,67,78,89,91};
		
		System.out.println("Given array elements:");
		
		for (int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"");
			
		}
		System.out.println("\n========");
		System.out.println("\n Even number of the array:");
		for(int i=0;i<arr.length;i++)
		{
			
			if (arr[i]%2==0)
			{
				System.out.print(arr[i]+"");
			}
		}
		
		System.out.println("\n======");
		System.out.println("\nOdd number of the array:");
		for(int i=0;i<arr.length;i++)
			
		{
			if(arr[i]%2!=0)
			{
				System.out.print(arr[i]+"");
			}
		}
		
		System.out.println("\n=====");
		
		

	}

}
