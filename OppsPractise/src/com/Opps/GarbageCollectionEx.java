package com.Opps;

public class GarbageCollectionEx {
	
	public void finalize() {
		System.out.println("object is garbage collected");
		
	}

	public static void main(String[] args) {
		GarbageCollectionEx g1=new GarbageCollectionEx();
		
		GarbageCollectionEx g2=new GarbageCollectionEx();
		
		g1=null;
		
		g2=null;
		
		System.gc();

	}

}


