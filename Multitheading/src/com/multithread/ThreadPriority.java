package com.multithread;

public class ThreadPriority extends Thread 
{
	public void run()
	{
		System.out.println("run()method");
		String threadName=Thread.currentThread().getName();
		Integer threadPrio=Thread.currentThread().getPriority();
		
		System.out.println(threadName+ "has priority" +threadPrio);
	}

	public static void main(String[] args)
	{
		ThreadPriority t1=new ThreadPriority();
		ThreadPriority t2=new ThreadPriority();
		ThreadPriority t3=new ThreadPriority();
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
		
		

	}

}
