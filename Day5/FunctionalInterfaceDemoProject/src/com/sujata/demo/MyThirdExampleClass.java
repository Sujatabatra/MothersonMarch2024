package com.sujata.demo;

import java.util.function.BiFunction;

public class MyThirdExampleClass {

	public static void main(String args[]) {
		BiFunction<String, String, Integer> biFunction=(str1,str2)->str1.compareTo(str2);
		
		System.out.println(biFunction.apply("Batra", "Sujata"));
	}
}
