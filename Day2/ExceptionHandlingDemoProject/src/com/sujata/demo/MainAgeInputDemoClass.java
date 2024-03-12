package com.sujata.demo;

public class MainAgeInputDemoClass {

	public static void main(String[] args) {
		AgeInputDemoClass aOb=new AgeInputDemoClass();
		aOb.setAge(12);
		
		System.out.println("=====================");
		
		try {
			AgeInputDemoClass aOb2=new AgeInputDemoClass(12);
		} catch (AgeException e) {
			System.out.println("Not eligible for voting");
		}
	}

}
