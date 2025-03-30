package com.springTutorial.constructorInjection;

public class Student {

	private int studentID;
	private String studentName;
	private String courseId;
	
	
	public Student(int studentID, String studentName, String courseId) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.courseId = courseId;
	}


	public int getStudentID() {
		return studentID;
	}


	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public String getCourseId() {
		return courseId;
	}


	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}


	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", courseId=" + courseId + "]";
	}
	
	
	
	
}
