package com.LibrarySystem;


	
//	Class 1: Book 
//	● bookId, bookName 
//	Class 2: Library 
//	● Method to display books 
//	Requirements: 
//	● Create multiple books 
//	● Pass objects to library 
//	● Display all books 
	
	
	class book{
		int bookId;
		String bookName ;
		
		book(int bookId, String bookName) {
	        this.bookId = bookId;
	        this.bookName = bookName;
	    }
		
	}
	
	class Library{
		
		void display(book[] books) {

	        System.out.println("Book ID\tBook Name");

	        for (int i = 0; i < books.length; i++) {
	            System.out.println(books[i].bookId + "\t" + books[i].bookName);
	        }
	    }
		
	}
	public class LibrarySystem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		book[] books = new book[3];

        books[0] = new book(101, "Java");
        books[1] = new book(102, "C++");
        books[2] = new book(103, "Python");

       
        Library lib = new Library();
        lib.display(books);

	}

}
