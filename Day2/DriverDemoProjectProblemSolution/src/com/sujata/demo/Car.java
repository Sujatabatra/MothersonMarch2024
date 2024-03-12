package com.sujata.demo;
/*
 * abstract : can be a class or a method
 * 1. if a class have even single method as abstract, 
 * we need to mark our class also abstract.
 * 2. We can't instantiate abstract class.
 * Abstract class is like : certain concrete things I am doing and signing the contract with the child class tpo fulfil certain contract.
 */
abstract public class Car {

	private String model,color;

	public Car(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
//	public void engine() {
//		System.out.println("Car has no engine to drive");
//	}
	
	abstract public void engine();
}
