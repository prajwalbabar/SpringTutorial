package com.springTutorial.constructorInjection;

public class Addition {

	int num1;
	int num2;
	
	
	
	
	
	public Addition(double num1, double num2) {
		super();
		this.num1 = (int) num1;
		this.num2 = (int) num2;
		System.out.println("Contructor: double, dounle");
	}
	
	public Addition(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		System.out.println("Contructor: int, int");
	}
	
	public Addition(String num1, String num2) {
		super();
		this.num1 = Integer.parseInt(num1);
		this.num2 = Integer.parseInt(num2);
		System.out.println("Contructor: String, String");
	}
	
	public void sum() {
		System.out.println("sum: "+(num1+num2));
	}
	
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	
}
