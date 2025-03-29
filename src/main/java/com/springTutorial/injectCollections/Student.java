package com.springTutorial.injectCollections;

import java.util.*;

public class Student {

	private int studentId;
	private List<String> addresses;
	private Set<String> phoneNo;
	private Map<String, String> courses;
	private Properties appProperties;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public List<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}
	public Set<String> getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(Set<String> phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Properties getAppProperties() {
		return appProperties;
	}
	public void setAppProperties(Properties appProperties) {
		this.appProperties = appProperties;
	}
	
	
	public Student(int studentId, List<String> addresses, Set<String> phoneNo, Map<String, String> courses,
			Properties appProperties) {
		super();
		this.studentId = studentId;
		this.addresses = addresses;
		this.phoneNo = phoneNo;
		this.courses = courses;
		this.appProperties = appProperties;
	}
	
	
	
	 public void displayProperties() {
	        appProperties.forEach((key, value) -> System.out.println(key + " = " + value));
	    }
	 
	 public void displayEmployees() {
		 courses.forEach((key, value) -> System.out.println(key + " -> " + value));
	    }
	 
	 public void displayNames() {
		 phoneNo.forEach(System.out::println);
	    }
	 
	 public void displayNames2() {
		 addresses.forEach(System.out::println);
	    }
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
