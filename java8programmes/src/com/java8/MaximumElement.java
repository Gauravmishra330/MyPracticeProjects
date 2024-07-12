package com.java8;

import java.util.Arrays;

public class MaximumElement {

	public static int findMaxElement(int[] arr) {
		
		return Arrays.stream(arr).max().getAsInt();

	}

}
