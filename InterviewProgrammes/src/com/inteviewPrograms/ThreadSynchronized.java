package com.inteviewPrograms;

public class ThreadSynchronized {
	
	final String str1="rsc1";
	final String str2="rsc2";
	Thread t1 =new Thread() {
		
		public void run() {
			synchronized(str1) {
				
				Sop("t1 got str1 lock");
				Thread.sleep(100);
				synchronized(str2) {
					Sop("t1 got str2 lock");
				
			}
		}
	}
	
	Thread t2=new Thread() {
		
		public void run() {
			
			synchronized(str2) {
				Sop("t2 got str1 lock");
				Thread.sleep(100);
				synchronized(str1) {
					sop("t2 got str2 lock");
				
			
		
	}

}
		}

	
	t1.Start();
	t2.Start();
		
	
	
}
	}
}








