package com.sujata.demo;

import java.util.Scanner;

public class MySecondDemoClass {

	static void divide(int number1, int number2) {
		try {
			int div = number1 / number2;
			System.out.println("Result : " + div);
			System.out.println("Good Bye from try block");
			return;
		} catch (NullPointerException ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			System.out.println("Hi I am finally block");
		}
		System.out.println("Good Bye from method");
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter First Number : ");
			int number1 = scanner.nextInt();

			System.out.println("Enter Second Number : ");
			int number2 = scanner.nextInt();
			divide(number1, number2);

		} catch (ArithmeticException ex) {
			System.out.println("undefined");
		} catch (Exception ex) {
			System.out.println("Something went wrong");
		}
		System.out.println("Good Bye from main");

	}

}
