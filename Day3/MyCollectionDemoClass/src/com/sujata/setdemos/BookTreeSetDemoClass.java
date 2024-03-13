package com.sujata.setdemos;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class BookTreeSetDemoClass {

	public static void main(String[] args) {
		/*
		 * Treeset is autogrowable and auto shrinkable,
		 * sorted unique collection of Objects.
		 */
		Set<Book> collection=new TreeSet<Book>();

		System.out.println("Size of Collection : "+collection.size());
		System.out.println(collection);
		collection.add(new Book(1, "Book1", "Author A", 1500, 500));
		collection.add(new Book(2, "Book2", "Author B", 500, 200));
		collection.add(new Book(3, "Book3", "Author A", 1700, 5100));
		collection.add(new Book(4, "Book4", "Author C", 6500, 2500));
		
		System.out.println("Size of Collection : "+collection.size());
		System.out.println(collection);
		
		collection.add(new Book(1, "Book1", "Author A", 1500, 500));
		collection.add(new Book(5, "Book5", "Author X", 800, 900));
		
		System.out.println("Size of Collection : "+collection.size());
		System.out.println(collection);
		
		collection.remove(new Book(1, "Book1", "Author A", 1500, 500));
		System.out.println("Size of Collection : "+collection.size());
		System.out.println(collection);
		
		System.out.println("Traversal using for each");
		for(Book element:collection) {
			System.out.println(element);
		}
		
		System.out.println("Traversal using Iterator");
		Iterator<Book> iterator=collection.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	
	}

}
