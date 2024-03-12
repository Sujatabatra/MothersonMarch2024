package com.sujata.demo;

//import java.util.Scanner;

public class MyFirstDemoClass {

	public static void main(String[] args) {
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		try {
		System.out.println("Enter First Number : ");
		int number1=scanner.nextInt();
		
		System.out.println("Enter Second Number : ");
		int number2=scanner.nextInt();
		
		int div=number1/number2;
		
		System.out.println("Division Result "+div);
		
		System.out.println("Good Bye from Try");
		}
		catch(NullPointerException ex) {
			System.out.println("Something went wrong");
		}
		
		catch(ArithmeticException ex) {
			System.out.println("undefined");
		}
		catch(Exception ex) {
			System.out.println("Something went wrong, please try again!");
		}
		System.out.println("Good Bye from Main!");
		

	}

}
