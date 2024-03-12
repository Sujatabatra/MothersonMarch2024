package com.sujata.demo;

public class CarRental {

	public static void main(String[] args) {
		BMW bmw1=new BMW("Q5", "Blue");
		BMW bmw2=new BMW("Q3", "Black");
		
		Audi audi=new Audi("A6", "Red");
		
		Driver driver1=new Driver("Suresh");
		Driver driver2=new Driver("Ramesh");
		
		driver2.setCar(bmw1);
		driver2.drive();
	}

}
