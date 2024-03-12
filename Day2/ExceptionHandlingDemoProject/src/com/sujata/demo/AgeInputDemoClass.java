package com.sujata.demo;

public class AgeInputDemoClass {

	private int age;

	
	public AgeInputDemoClass() {
		super();
	}

	public AgeInputDemoClass(int age)throws AgeException {
		if(age<18)
			throw new AgeException("Age must be greater than or equal to 18");
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		try {
		if(age<18)
			throw new AgeException("Age must be greater than or equal to 18");
		}
		catch(AgeException ex) {
			System.out.println(ex.getMessage());
		}
		this.age = age;
	}
	
	
}
