package com.ExceptionHandling;

public class Test
{
	static int cnt=0;
	
	Test() throws NotMoreException
	{
		if(cnt==0)
		{
			cnt++;
		}
		
		else
			throw new NotMoreException();
		
	}

}
