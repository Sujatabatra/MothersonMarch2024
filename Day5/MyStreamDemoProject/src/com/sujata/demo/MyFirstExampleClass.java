package com.sujata.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MyFirstExampleClass {

	public static void main(String[] args) {
		List<Integer> collection=Arrays.asList(90,120,30,45,56,67,90);
		
		Stream<Integer> stream=collection.stream();
		
		stream
		.sorted()
		.limit(4)
		.forEach(System.out::println);
		
//	below statement gives exception as java.lang.IllegalStateException: stream has already been operated upon or closed
//		stream.forEach(System.out::println);
	}

}
