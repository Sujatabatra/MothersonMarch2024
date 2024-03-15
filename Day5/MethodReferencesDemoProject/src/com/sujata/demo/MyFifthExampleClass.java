package com.sujata.demo;

class Person{
	private int pId;
	private String pName;
	private int age;
	
	public Person() {
		
	}

	public Person(int pId, String pName, int age) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + ", age=" + age + "]";
	}
	
}

@FunctionalInterface
interface PersonFactory{

	Person getPerson(int id,String name,int age);
}
public class MyFifthExampleClass {

	public static void main(String[] args) {
		
//		PersonFactory personFactory=(id,na,a)->new Person(id,na,a);

		PersonFactory personFactory=Person::new;
		System.out.println(personFactory.getPerson(10, "AAA", 30));
	}

}
