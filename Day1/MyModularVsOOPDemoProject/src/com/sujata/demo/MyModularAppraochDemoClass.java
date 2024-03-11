package com.sujata.demo;

public class MyModularAppraochDemoClass {

	static int number,factorial;
	
	static void input(int n) {
		number=n;
	}
	
	static void calculateFactorial() {
		factorial=1;
		while(number>=1)
			factorial*=number--;
	}
	
	static void display() {
		System.out.println("Factorial : "+factorial);
	}
	public static void main(String[] args) {
		input(4);
		calculateFactorial();
		factorial=0;//Accidental corruption of data(Logical error)
		display();

	}

}
