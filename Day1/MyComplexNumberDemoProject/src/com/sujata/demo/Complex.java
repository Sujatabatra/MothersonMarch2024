package com.sujata.demo;

/*
 * Constructor are used to initialize the objects while declaring them.
 * Rules for creating constructor are as follows
 * 1.Constructor have same name as that of class name
 * 2.Constructor can be argumented as well as non argumented
 * 3.Constructor cannot return any value not even void
 * 4. Constructor can have any scope i.e public as well as private
 * Note : When any class is constructor challenged(don't have any constructor)
 * then only compiler will automatically create one 
 * zero argument constructor 
 * (default constructor)for the respective class
 */
public class Complex {

	private int real,imagenary;

	public Complex(int real, int imagenary) {
		this.real = real;
		this.imagenary = imagenary;
	}
	private Complex(){
		
	}
	public int getReal() {
		return real;
	}

	public void setReal(int real) {
		this.real = real;
	}

	public int getImagenary() {
		return imagenary;
	}

	public void setImagenary(int imagenary) {
		this.imagenary = imagenary;
	}
	
	public void display() {
		System.out.print(real);
		if(imagenary>0)
			System.out.println("+"+imagenary+"i");
		else if(imagenary<0)
			System.out.println(imagenary+"i");
	}
	
	public Complex sum(Complex complex) {
		Complex sumComplex=new Complex();
		
		sumComplex.real=this.real+complex.real;
		sumComplex.imagenary=this.imagenary+complex.imagenary;
		
		return sumComplex;
	}
}
