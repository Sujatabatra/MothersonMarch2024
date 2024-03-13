package com.sujata.setdemos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.sujata.demo.Person;

public class PersonHashSetDemoClass {

	public static void main(String[] args) {
		/*
		 * Hashset is autogrowable and auto shrinkable,
		 * unordered unique collection of Objects.
		 */
		Set<Person> collection=new HashSet<Person>();

		System.out.println("Size of Collection : "+collection.size());
		System.out.println(collection);
		collection.add(new Person(1, "AAA"));
		collection.add(new Person(2, "BBB"));
		collection.add(new Person(3, "CCC"));
		collection.add(new Person(4, "DDD"));
		
		System.out.println("Size of Collection : "+collection.size());
		System.out.println(collection);
		
		collection.add(new Person(1, "AAA"));
		collection.add(new Person(5, "EEE"));
		
		System.out.println("Size of Collection : "+collection.size());
		System.out.println(collection);
		
		collection.remove(new Person(1, "AAA"));
		System.out.println("Size of Collection : "+collection.size());
		System.out.println(collection);
		
		System.out.println("Traversal using for each");
		for(Person element:collection) {
			System.out.println(element);
		}
		
		System.out.println("Traversal using Iterator");
		Iterator<Person> iterator=collection.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	
	}

}
