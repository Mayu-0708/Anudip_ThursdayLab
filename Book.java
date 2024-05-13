/*
 * Q2)Create a Book class to store Books information(bookid, title, author name, price).
	  Create an object and assign values to Book variables and print them using a method.
	  For printing use the bookid if the book is available so display the details and if book 
	  is not available show the msg by using exception   
 */
package Thrusday_Lab;

//Define the Book class
public class Book 
{
	 // Member variables
	 private int bookId;
	 private String title;
	 private String authorName;
	 private double price;
	 private boolean available;
	
	 // Constructor
	 public Book(int bookId, String title, String authorName, double price, boolean available) 
	 {
	     this.bookId = bookId;
	     this.title = title;
	     this.authorName = authorName;
	     this.price = price;
	     this.available = available;
	 }
	
	 // Method to display book details or throw exception if book is not available
	 public void displayBookDetails() throws BookNotAvailableException 
	 {
	     if (available)
	     {
	         System.out.println("Book ID: " + bookId);
	         System.out.println("Title: " + title);
	         System.out.println("Author: " + authorName);
	         System.out.println("Price: Rs." + price);
	     }
	     else 
	     {
	         throw new BookNotAvailableException("Book with ID " + bookId + " is not available.");
	     }
	 }
}



