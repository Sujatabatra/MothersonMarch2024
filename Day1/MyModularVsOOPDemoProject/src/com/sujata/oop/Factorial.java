package com.sujata.oop;

/*
 * if data needs to modifiable : create setter
 * if data needs to be readable : create getter
 */
public class Factorial {

	private int number,factorial;

	public void setNumber(int number) {
		this.number = number;
	}

	public int getFactorial() {
		calculateFactorial();
		return factorial;
	}
	
	private void calculateFactorial() {
		factorial=1;
		while(number>=1)
			factorial*=number--;
	}
	
//	public void dummy() {
//		Factorial factorial=new Factorial();
//		
//	}
}
