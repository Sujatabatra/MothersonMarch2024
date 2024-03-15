package com.sujata.demo;

public class BookSearchMain {

	public static void main(String[] args) {
		BookSearch bookSearch=new BookSearch();
		
		System.out.println(bookSearch.searchThickBooks());
		
		System.out.println(bookSearch.searchBook(new ThickBookPredicate()));
		
		
		System.out.println(bookSearch.searchBook(new BookPredicate() {
			@Override
			public boolean test(Book book) {
				return book.getPrice()>5000;
			}
		}));
		
//		BookPredicate thickBookPredicate=new BookPredicate() {
//			@Override
//			public boolean test(Book book) {
//				return book.getNoOfPages()>7000;
//			}
//		};

		BookPredicate thickBookPredicate=book-> book.getNoOfPages()>7000;
			
		
	}

}
