package com.sujata.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BookSearch {
	
	static private List<Book> bookList=new ArrayList<Book>();
	
	static{
		bookList.add(new Book(1, "Book 1", "Author A", 500, 200));
		bookList.add(new Book(2, "Book 2", "Author B", 5100, 1200));
		bookList.add(new Book(3, "Book 3", "Author X", 6700, 9500));
		bookList.add(new Book(4, "Book 4", "Author Z", 800, 2000));
		bookList.add(new Book(5, "Book 5", "Author Z", 6100, 4500));
		bookList.add(new Book(6, "Book 6", "Author Z", 600, 1400));
	}

	public List<Book> searchThickBooks(){
		List<Book> searchedBooks=new ArrayList<Book>();
		for(Book book:bookList) {
			if(book.getNoOfPages()>5000)
				searchedBooks.add(book);
		}
		return searchedBooks;
	}
	
	public List<Book> searchExpensiveBooks(){
		List<Book> searchedBooks=new ArrayList<Book>();
		for(Book book:bookList) {
			if(book.getPrice()>2500)
				searchedBooks.add(book);
		}
		return searchedBooks;
	}
	
	public List<Book> searchBook(BookPredicate bookPredicate){
		List<Book> searchedBooks=new ArrayList<Book>();
//		for(Book book:bookList) {
//			if(bookPredicate.test(book))
//				searchedBooks.add(book);
//		}
		return bookList.stream()
		.filter(bookPredicate::test)
		.collect(Collectors.toList());
		
	}
}
