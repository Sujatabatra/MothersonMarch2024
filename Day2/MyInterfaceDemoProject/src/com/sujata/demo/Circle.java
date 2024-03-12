package com.sujata.demo;

public class Circle implements RoundedShape {

	private double radius;
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public void area() {
		double area=PI*radius*radius;
		System.out.println("Area : "+area);

	}

	@Override
	public void cicumference() {
		double circumference;
		circumference=2*PI*radius;
		System.out.println("Circumference of Circle : "+circumference);

	}

}
