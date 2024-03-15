package com.sujata.demo;

import java.util.function.Function;

public class MyFirstExampleClass {

	public static void main(String[] args) {

//		Function<String, Integer> var=new Function<String, Integer>() {
//			
//			@Override
//			public Integer apply(String t) {
//				// TODO Auto-generated method stub
//				return null;
//			}
//		};
		
		Function<String, Integer> calculateLength=str->str.length();

		int length=calculateLength.apply("Sujata");
		System.out.println("Length : "+length);
		
		
		
	}

}
