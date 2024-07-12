package java50interview;

public class StringContainsVowels {

	public static void main(String[] args) {
		
		System.out.println(stringContainsVowels("Hello"));
		
		System.out.println(stringContainsVowels("Tv"));
		

	}
	
	public static boolean stringContainsVowels(String input) {
		return input.toLowerCase().matches(".*[aeiou].*");
	}

}
