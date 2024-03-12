package com.sujata.setdemos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemoClass {

	public static void main(String[] args) {
		/*
		 * Hashset is autogrowable and auto shrinkable,
		 * unordered unique collection of Objects.
		 */
		Set<Integer> collection=new HashSet<Integer>();

		System.out.println("Size of Collection : "+collection.size());
		System.out.println(collection);
		collection.add(10);
		collection.add(5);
		collection.add(150);
		collection.add(65);
		
		System.out.println("Size of Collection : "+collection.size());
		System.out.println(collection);
		
		collection.add(150);
		collection.add(50);
		
		System.out.println("Size of Collection : "+collection.size());
		System.out.println(collection);
		
		collection.remove(150);
		System.out.println("Size of Collection : "+collection.size());
		System.out.println(collection);
		
		System.out.println("Traversal using for each");
		for(Integer element:collection) {
			System.out.println(element);
		}
		
		System.out.println("Traversal using Iterator");
		Iterator<Integer> iterator=collection.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	
	}

}
