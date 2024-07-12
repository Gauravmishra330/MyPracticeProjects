package com.java8;

public class FunctionalInterfaceTest {

	public static void main(String[] args) {
	//anonymous class
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("I just implemented the Runnable Functional Interface");
				
			}
		}).start();

	}

}
