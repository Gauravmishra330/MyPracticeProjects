package com.multithread;

public class CustomDemo
{

	public static void main(String[] args) throws CustomException
	{
		CustomDemo custom=new CustomDemo();
		custom.display();
		

	}
	
	public void display() throws CustomException
	{
		for(int i=2;i<20;i=i+2)
		{
			System.out.println("i="+i);
			if(i==8)
			{
				throw new CustomException("My Exception Occurred");
			}
		}
	}

}
