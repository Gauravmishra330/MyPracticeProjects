package prime;

import java.util.Scanner;
import java.lang.*;

public class Employeesalary {

	public static void main(String[] args) {
	
		float basic_salary,bonus1=0,bonus=0,gst;
		int grade;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the Employee Basic Salary: ");
		basic_salary=scan.nextFloat();
		
		System.out.println("\nEnter the Employee Bonus:");
		grade=scan.nextInt();
		
		if(grade==15) {
			bonus=(basic_salary*15) /100;
			
		}
		else if(grade==16 || grade==17) {
			
			bonus=(basic_salary*20) /100;
		}
		else if(grade>=18) {
			bonus=(basic_salary*25)/100;
		}
		
		basic_salary+=bonus;
		
		if (basic_salary>=15000 && basic_salary <= 22000) {
			gst=(basic_salary*15)/100;
			
			basic_salary-=gst;
			
			bonus1=(basic_salary*6)/100;
			
			basic_salary+=bonus1;
		}
		else {
			bonus1=(basic_salary*6)/100;
			
			basic_salary+=bonus1;
		}
		
		System.out.println("\nGross Employee Salary is:"+basic_salary);
	}

}
