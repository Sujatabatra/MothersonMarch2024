package com.sujata.setdemos;

import java.util.Objects;

public class Book implements Comparable<Book> {

	private int bId;
	private String bookName;
	private String authorName;
	private int noOfPages;
	private int price;
	
	public Book() {
		
	}
	
	public Book(int bId, String bookName, String authorName, int noOfPages, int price) {
		super();
		this.bId = bId;
		this.bookName = bookName;
		this.authorName = authorName;
		this.noOfPages = noOfPages;
		this.price = price;
	}


	public int getbId() {
		return bId;
	}


	public void setbId(int bId) {
		this.bId = bId;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public String getAuthorName() {
		return authorName;
	}


	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}


	public int getNoOfPages() {
		return noOfPages;
	}


	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


//	@Override
//	public int hashCode() {
//		return Objects.hash(authorName, bId, bookName, noOfPages, price);
//	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(authorName, other.authorName) && bId == other.bId
				&& Objects.equals(bookName, other.bookName) && noOfPages == other.noOfPages && price == other.price;
	}

	@Override
	public int compareTo(Book book) {
		if(this.equals(book))
			return 0;
		if(this.noOfPages>book.noOfPages)
			return 1;
		else if(this.noOfPages<=book.noOfPages)
			return -1;
		return 0;
	}

	@Override
	public String toString() {
		return "Book [bId=" + bId + ", bookName=" + bookName + ", authorName=" + authorName + ", noOfPages=" + noOfPages
				+ ", price=" + price + "]";
	}

	
}
