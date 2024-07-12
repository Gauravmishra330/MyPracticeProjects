package com.opps;

public class MethodOverridingBowlerClass {
	void bowlingMethod()
	{
		System.out.println("bowler");
	}
	
	public class FastPacer {
		void bowlingMethod1()
		{
			
			System.out.println(" fast bowler ");
		}
	

	public static void main(String[] args) {
		
		FastPacer obj=newFastPacer();
		obj.bowlingMethod1();
	}


	private static FastPacer newFastPacer() {
		// TODO Auto-generated method stub
		return null;
	}
		

	}
}




