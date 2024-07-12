package com.ExceptionHandling;

public class Demo {

	public static void main(String[] args)
	{
		try
		{
			Test t1=new Test();
			Test t2=new Test();
			Test t3=new Test();
		}
		
		catch (NotMoreException ex)
		{
			System.out.println(ex);
		}
	}

}
