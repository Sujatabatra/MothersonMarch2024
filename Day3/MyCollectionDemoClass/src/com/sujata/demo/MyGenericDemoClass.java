package com.sujata.demo;

class IntegerInput{
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
}

class StringInput{
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}

class DoubleInput{
	private double value;

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
	
}

class GenericInput<T/*,X*/>{
	private T value;
//	private X somevalue;
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	
	
}

public class MyGenericDemoClass {

	public static void main(String[] args) {
		GenericInput<Integer> genericInput1=new GenericInput<>();
		genericInput1.setValue(10);
		
		GenericInput<Person> genericInput2=new GenericInput<>();
		genericInput2.setValue(new Person(101, "ABCD"));

	}

}
