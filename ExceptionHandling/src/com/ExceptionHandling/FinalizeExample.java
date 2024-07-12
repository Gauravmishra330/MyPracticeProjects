package com.ExceptionHandling;

public class FinalizeExample {
	public void finalize() {
		
		System.out.println("Finalize is called");
	}

	public static void main(String[] args)
	{
		FinalizeExample f1=new FinalizeExample();
		FinalizeExample f2=new FinalizeExample();
		
		f1=f2;
		f2=f2;
		
		System.gc();
		
	}

}
