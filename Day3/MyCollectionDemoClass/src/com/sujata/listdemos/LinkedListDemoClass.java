package com.sujata.listdemos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemoClass {

	public static void main(String[] args) {
		/*
		 * ArrayList is autogrowable and auto-shrinkable,
		 * duplicate ordered indexed collection of elements.
		 */
		List<Integer> collection=new LinkedList<Integer>();

		System.out.println("Size of collection : "+collection.size());
		System.out.println(collection);
		collection.add(10);
		collection.add(20);
		collection.add(30);
		collection.add(40);
		
		System.out.println("Size of collection : "+collection.size());
		System.out.println(collection);
		
		collection.add(20);
		collection.add(50);
		
		System.out.println("Size of collection : "+collection.size());
		System.out.println(collection);
	
//		Integer i=new Integer(10);  (Deprecated)
//		Integer i=Integer.valueOf(10);
		
		collection.remove(Integer.valueOf(10));
		
		System.out.println("Size of collection : "+collection.size());
		System.out.println(collection);
		
		System.out.println("Traversal using traditional for loop");
		for(int index=0;index<collection.size();index++) {
			System.out.println(collection.get(index));
		}
		
		System.out.println("Traversal using for each");
		for(Integer element:collection) {
			System.out.println(element);
		}
		
		System.out.println("Traversal using Iterator");
		Iterator<Integer> iterator=collection.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
		
		System.out.println("Reverse Traversal using ListIterator");
		ListIterator<Integer> listIterator=collection.listIterator();
		while(listIterator.hasNext())
			listIterator.next();
		while(listIterator.hasPrevious())
			System.out.println(listIterator.previous());
		
	}

}
