package com.sujata.demo;

import java.util.function.Consumer;

public class MySecondExampleClass {

	public static void main(String[] args) {
		Consumer<String> consumer=str->System.out.println(str);
		
		consumer.accept("Sujata");

	}

}
