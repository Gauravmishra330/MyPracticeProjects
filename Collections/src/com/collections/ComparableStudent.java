package com.collections;

public class ComparableStudent {
	private String studentname;
	private int rollno;
	private int studentage;

	public ComparableStudent(int rollno, String studentname,int studentage) {
		
		this.rollno=rollno;
		this.studentname=studentname;
		this.studentage=studentage;
		
	}
	
	public String getStudentname() {
		return studentname;
	}
	
	public void setStudentname(String studentname) {
		this.studentname=studentname;
	}
	
	public int getRollno(int rollno) {
		return this.rollno=rollno;
	}
	
	public int getStudentage() {
		return studentage;
	}

	public void setStudentage(int studentage) {
		this.studentage=studentage;
	}
}
