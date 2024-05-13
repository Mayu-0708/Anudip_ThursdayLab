package Thrusday_Lab;

import java.util.Scanner;

public class Book_Store 
{
	public static void main(String[] args)
	{
		int bookId;
		String title,authorName;
		double price;
		boolean available;
		char Answer;
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        System.out.println("!!!!!!!!!!..WELCOME..!!!!!!!!!!\n");
        do 
        {
        	
	        // Get book details from the user
	        System.out.println("Enter Book ID:");
	        bookId = scanner.nextInt();
	        scanner.nextLine(); // Consume newline character
	        
	        System.out.println("Enter Title:");
	         title = scanner.nextLine();
	        
	        System.out.println("Enter Author:");
	         authorName = scanner.nextLine();
	        
	        System.out.println("Enter Price:");
	         price = scanner.nextDouble();
	        
	        System.out.println("Is the book available? (true/false):");
	         available = scanner.nextBoolean();
	
	        // Create a Book object with user input
	        Book book1 = new Book(bookId, title, authorName, price, available);
	
	        try 
	        {
	            // Try to display book details
	            book1.displayBookDetails();
	        } 
	        catch (BookNotAvailableException e) 
	        {
	            // Catch exception if book is not available
	            System.out.println(e.getMessage());
	        }
	       
	        System.out.println("Do you want to search any other book (yes/no) : ");
	        Answer = scanner.next().charAt(0);
        }
        while(Answer == 'y' || Answer == 'Y');
        System.out.println("Thanks for visit....!!!!");
    }
}
