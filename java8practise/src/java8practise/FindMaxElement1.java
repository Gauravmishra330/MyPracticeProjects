package java8practise;

import java.util.Arrays;

public class FindMaxElement1 {
	
	public static int findMaxElement(int[] arr) {
		
		return Arrays.stream(arr).max().getAsInt();
	}

}
