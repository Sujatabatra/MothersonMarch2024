package com.sujata.demo;

@FunctionalInterface
public interface BookPredicate {

	public boolean test(Book book);
	
}
