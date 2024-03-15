package com.sujata.demo;

import java.util.function.Function;

public class MyFourthExampleClass {

	public static void main(String[] args) {
//		Function<String, Integer> function=str->Integer.parseInt(str);
		Function<String, Integer> function=Integer::parseInt;
		System.out.println(function.apply("10"));
		

	}

}
