package com.sujata.demo;

public class MainComplex {

	public static void main(String[] args) {
		Complex complex1=new Complex(3,6);
		complex1.display();
		
//		Complex complex2=new Complex();
//		complex2.display();
		
		Complex complex2=new Complex(5,3);
		complex2.display();
		
		Complex complex3=complex1.sum(complex2);
		complex3.display();

	}

}
