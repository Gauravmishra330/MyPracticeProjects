package com.Opps;

import java.io.Reader;
import java.util.concurrent.atomic.LongAdder;

public class MethodOverloadingAdder {
	
	static int add(int a,int b)
	{
		return a+b;
	}
	
	static int add(int a,int b,int c)
	{
		return a+b+c;
	}
	
	

	public static void main(String[] args) {
		System.out.println(Adder.add(11,11,11));
		
	}
}


