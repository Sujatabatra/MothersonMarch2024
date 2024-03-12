package com.sujata.demo;

/*
 * By default child class constructor gives call
 * to base class default constructor,
 * but if we don't have default constructor in base class,
 * we need to give call to Base class Argumented constructor
 * using super keyword.
 */
public class BMW extends Car {

	public BMW(String model, String color) {
		super(model, color);
	}
	
	public void bmwEngine() {
		System.out.println("BMW Engine goes BOOOM....");
	}

	
}
