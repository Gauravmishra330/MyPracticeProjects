package com.multithread;

public class TestThreadTwice1 extends Thread {
	public void run() {
		
		System.out.println("Thread is executing now----");
	}
	
	public static void main(String[] args)
	{
		TestThreadTwice1 t1=new TestThreadTwice1();
		t1.start();
		t1.start();
		

	}

}
