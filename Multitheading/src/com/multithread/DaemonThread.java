package com.multithread;

public class DaemonThread extends Thread
{
	public DaemonThread(String name) {
		super(name);
	}
	
	public void run()
	{
		// Cheaking wheather the thread is Daemon or not
		
		if(Thread.currentThread().isDaemon())
		{
			System.out.println(getName()+ " is Daemon thread");
		}
	}

	public static void main(String[] args) 
	{
		
		DaemonThread t1=new DaemonThread("t1");
		DaemonThread t2=new DaemonThread("t2");
		DaemonThread t3=new DaemonThread("t3");
		
		// Setting user thread t1 to Daemon
		t1.start();
		t2.start();
		// setting user thread t3 to Daemon
		t3.setDaemon(true);
		t3.start();
	}

}
