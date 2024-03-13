package com.sujata.demo;

public class MyObjectEqualDemoClass {

	public static void main(String[] args) {
		int x=10,y=10;
		
		if(x==y)
			System.out.println("x and y are equal");
		else
			System.out.println("x and y are not equal");
		
		Person p1=new Person(1, "AAA");
		Person p2=new Person(1, "AAA");
		
		if(p1==p2)
			System.out.println("p1 and p2 are equal");
		else
			System.out.println("p1 and p2 are not equal");

		if(p1.equals(p2))
			System.out.println("p1 and p2 are equal");
		else
			System.out.println("p1 and p2 are not equal");
		
		System.out.println("p1 : "+p1.toString());
		System.out.println("p2 : "+p2);
	}

}
