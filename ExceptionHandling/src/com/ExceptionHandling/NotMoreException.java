package com.ExceptionHandling;

public class NotMoreException extends Exception
{
	NotMoreException()
	{
		super("No more than 1 object");
	}

}
