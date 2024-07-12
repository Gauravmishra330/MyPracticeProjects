package com.collections;

import java.util.Comparator;

public class Student implements Comparable {
	
	private String studentname;
	private int rollno;
	private int studentage;
	
	public Student(int rollno,String studentname,int studentage) {
		
		this.rollno=rollno;
		this.studentname=studentname;
		this.studentage=studentage;
	}
	
	//getter and setter methods same as the above example
	
	public int compareTo(Student comparestu) {
		int compareage=((Object)comparestu).getStudentage();
		
		/* For Ascending order*/
		return this.studentage-compareage;
		
		/* For Descending order do like this*/
		// return compareage-this.studentage;
		
		
	}
	
	@Override
	public String toString() {
		return"[rollno="+rollno+",name="+studentname+",age="+studentage +"]";		
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
