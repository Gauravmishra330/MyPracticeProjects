package prime;

import java.util.Scanner;
import java.io.*;

/* Positive Negative Program in java*/
public class Posi_Negative {

	public static void main(String[] args) {
		
		int number;
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter the Number you want to Check:");
		
		number=scan.nextInt();
		
		if(number>0) {
			
			System.out.println("The Number Is"+number+"is Positive");
		}
		else if(number<0) {
			
			System.out.println("The Number Is" +number+" is Negative");
			
			
			
		}
		else {
			
			System.out.println("The Number Is"+number + "is Zero");
		}
	
		
	}

}
