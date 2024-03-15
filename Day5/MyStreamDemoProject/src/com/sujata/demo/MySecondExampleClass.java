package com.sujata.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MySecondExampleClass {
	public static void main(String args[]) {
		List<Integer> list=Arrays.asList(56,67,22,35,97,12);
		
		list.stream()
		.filter((element)->element%2==0)
		.map(ele->ele+5)
		.sorted()
		.forEach(System.out::println);

		System.out.println(list.stream()
		.filter((element)->element%2==0)
		.count());
		
		List<Integer> newList=list.stream()
				.filter(ele->ele%2==0)
				.collect(Collectors.toList());
		System.out.println(newList);
		
	}

}
