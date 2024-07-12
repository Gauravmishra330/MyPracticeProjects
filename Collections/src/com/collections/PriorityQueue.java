package com.collections;

import java.util.*;

public class PriorityQueue {

	public static void main(String[] args) {
		PriorityQueue 
		queue=new PriorityQueue();
		
		queue.add("Amit Sharma");
		queue.add("JaiShankar");
		queue.add("Raj");
		
		System.out.println("head:" +queue.element());
		System.out.println("head"+queue.peek());
		
		System.out.println("ietrating the queue elements:");
		
		Iterator itr=queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		queue.remove();
		queue.poll();
		System.out.println("after removing two elements:");
		Iterator<String> itr2=queue.iterator();
		
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}

	}

}
