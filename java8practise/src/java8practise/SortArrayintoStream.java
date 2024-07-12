package java8practise;

import java.util.Arrays;

public class SortArrayintoStream {

	public static void main(String[] args) {
		
		int arr[]= {99,55,203,99,4,91};
		
		Arrays.parallelSort(arr);
		
		
		Arrays.stream(arr).forEach(s -> {
		    System.out.print(s + " ");
		});
		
		
	}

}
