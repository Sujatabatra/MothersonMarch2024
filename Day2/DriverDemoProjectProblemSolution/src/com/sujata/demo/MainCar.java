package com.sujata.demo;

public class MainCar {

	public static void main(String[] args) {
		/*
		 * Dynamic Method Dispatch :
		 * Base class reference variable is type compatible with derived class,
		 * but reverse is not possible.
		 */
		
		//reference variable of base class
		Car car;
		
		car=new Audi("A8", "Red");
		
		car.engine();
//		Audi audi;
//		audi=new Car("xyz", "white");

		car=new Toyota("Altis", "Golden");
		car.engine();
	}

}
