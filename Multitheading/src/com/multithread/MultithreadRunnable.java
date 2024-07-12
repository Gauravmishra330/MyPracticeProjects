package com.multithread;

public class MultithreadRunnable implements Runnable
{
	public void run()
	{
		System.out.println("My thread is in running state");
	}

	public static void main(String[] args)
	{
		MultithreadRunnable obj=new MultithreadRunnable();
		Thread Threadobj = new Thread(obj);
		obj.start();
			
		}

	private void start() {
		// TODO Auto-generated method stub
		
	}
		

	}




