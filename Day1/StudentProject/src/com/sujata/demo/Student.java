package com.sujata.demo;

public class Student {

	private int rollNo;
	private String name;
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void input(int rollNo,String name) {
		this.rollNo=rollNo;
		this.name=name;
	}
	
	public void displayData() {
		System.out.println("Roll Number : "+rollNo);
		System.out.println("Name : "+name);
	}
	
}
