package prime;

public class FindSecondHighest {
	
	private static void findSecondHighest(int[] array) {
		
		int highest=Integer.MIN_VALUE;
		int secondHighest=Integer.MIN_VALUE;
		
		for (int i:array) {
			if (i>highest) {
				
				secondHighest=highest;
				highest=i;
			} else if (i>secondHighest) {
				secondHighest=i;
			}
		}
		
		return;
		
		
	}

}
