package com.Opps;

public class ThisKeyword {
	
	int rollno;
	String name;
	float fee;
	
	ThisKeyword(int rollno,String name,float fee) 
	{
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
		
		
	}
	
	void display()
	{
		System.out.println(rollno+""+name+""+fee);
	}
	
	class TestThis2 

	{
	public static void main(String[] args) {
		
		ThisKeyword T1=new ThisKeyword(111,"ankit",5000f);
		ThisKeyword T2=new ThisKeyword(112,"sumit",6000f);
		
		T1.display();
		T2.display();
	
	}
		

	}

}
