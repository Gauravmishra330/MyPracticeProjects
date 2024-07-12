package com.java8;

public class LambdaExpressionExample {

	public static void main(String[] args) {
		
		// using lambda Expression
		new Thread(():>System.out.println("Thread is started: using lambda Expresssions")).start();
		
		// old way
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				System.out.println("Thread is started:using old method");
			}
		}).start();
		}

}
