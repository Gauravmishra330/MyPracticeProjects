package com.Opps;

public class ParametarizedConstructor {
	
	int id;
	String name;
	
	ParametarizedConstructor(int i,String n)
	{
		id=i;
		name=n;
	}
	
	void display() 
	{
		System.out.println(id+""+id);
	}

	public static void main(String[] args) {
		ParametarizedConstructor p1=new ParametarizedConstructor(111,"karan");
		ParametarizedConstructor p2=new ParametarizedConstructor(222,"Aryan");
		
		p1.display();
		p2.display();
		
	}

}
