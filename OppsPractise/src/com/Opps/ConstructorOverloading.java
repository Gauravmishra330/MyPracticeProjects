package com.Opps;

public class ConstructorOverloading {
	
	int id;
	String name;
	int age;
	
	ConstructorOverloading(int i,String n)
	{
		id=i; 
		name=n;
	}
	
	ConstructorOverloading(int i,String n,int a)
	{
		id=i;
		name=n;
		age=a;
		
	}
	
	void display()
	{
		System.out.println(id+""+name+""+age);
		
	}
	
	

	public static void main(String[] args) {
		ConstructorOverloading c1=new ConstructorOverloading(111,"Karan");
		ConstructorOverloading c2=new ConstructorOverloading(222,"Aryan",25);
		
		c1.display();
		c2.display();
		
	}

}
