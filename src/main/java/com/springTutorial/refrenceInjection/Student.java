package com.springTutorial.refrenceInjection;

public class Student {
    private int studentID;
    private Department dept;
    private String studentName;
    
    
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void displayStudent() {
		System.out.println("Student Id: "+ getStudentID());
		System.out.println("Student Name: "+ getStudentName());
		System.out.println("Student Department: "+ dept.getDeptName());
	}
	
	
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
    
    
}
