package com.Oops;

import java.rmi.server.ObjID;

import org.ietf.jgss.Oid;

public class Base {
	private static void display() {
		System.out.println("Static or class method from Base");
	}
	
	public void print() {
		System.out.println("Non-Static or instance method from Base");
		
	}
	
	class Derived extends Base {
		private static void display() {
			System.out.println("Static or class method from Derived");
		}
		
		public void print() {
		System.out.println("Non-static or instance method from Derived");	
		}
		
		public class test {
			public static void main(String args[])
			{
				Oid.display();
				obj.print();
			}
		}
	}
}

