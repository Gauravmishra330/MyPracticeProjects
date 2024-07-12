package com.Arrays;

import java.util.*;

public class RearrangementCharString {
	
	public static void main(String args[]) {
		
		String s="aab";
		
		String rstr=reaarangeStr(s);
	}
	
	
	public static String reaarangeStr(String s) {
		
		Map<Character,Integer> cmap=new HashMap<>();
		for(char c:s.toCharArray()) {
			
			cmap.put(c,cmap.getOrDefault(c,0)+1);
		}
		
		PriorityQueue<Character> pq=new PriorityQueue<>((a,b) ->cmap.get(b)-cmap.get(a));
		pq.addAll(cmap.keySet());
		
		StringBuilder r=new StringBuilder();
		
		char pc='\0';
		while(!pq.isEmpty()) {
			
			char cc=pq.remove();
			
			r.append(cc);
			cmap.put(cc, cmap.get(cc)-1);
			
			if(pc !='\0' && cmap.get(pc)>0) {
				
				pq.add(pc);
			}
			
			pc=cc;
			if(pq.isEmpty() && cmap.get(cc)>0) {
				return "";
			}
			
			
		}
		return r.toString();
		
		
	}

}
