package Thrusday_Lab_8Feb;
/*
 * 3. write a program to create Book management system.using linked list
	create class name Book,and perform following actions:
	Attributes:
	bookid,bookName,bookPrice,authorName,library name(static),availability
	method:
	createBook() will store book details.(add  3 books).
	deleteBook() will delete book by Id
	displayBook()will display book details

 */
import java.util.LinkedList;
import java.util.Scanner;

public class BookManagementSystem 
{
    private static LinkedList<Book> books = new LinkedList<>();

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Adding 3 books initially
        books.add(new Book(1, "The Great Gatsby", 10.99, "F. Scott Fitzgerald"));
        books.add(new Book(2, "To Kill a Mockingbird", 12.50, "Harper Lee"));
        books.add(new Book(3, "1984", 9.99, "George Orwell"));

        int choice;
        do {
            System.out.println("\nBook Management System");
            System.out.println("1. Display All Books");
            System.out.println("2. Add New Book");
            System.out.println("3. Delete Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice)
            {
                case 1:
                    displayAllBooks();
                    break;
                case 2:
                    addNewBook(scanner);
                    break;
                case 3:
                    deleteBook(scanner);
                    break;
                case 4:
                    System.out.println("Exiting... Thank you...!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

    private static void displayAllBooks() 
    {
        if (books.isEmpty()) 
        {
            System.out.println("No books available in the library.");
        } else {
            System.out.println("List of Books:");
            for (Book book : books)
            {
                book.displayBook();
                System.out.println();
            }
        }
    }

    private static void addNewBook(Scanner scanner)
    {
        System.out.print("Enter Book ID: ");
        int bookId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Book Name: ");
        String bookName = scanner.nextLine();

        System.out.print("Enter Book Price: ");
        double bookPrice = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Author Name: ");
        String authorName = scanner.nextLine();

        books.add(new Book(bookId, bookName, bookPrice, authorName));
        System.out.println("Book added successfully!");
    }

    private static void deleteBook(Scanner scanner) 
    {
        System.out.print("Enter Book ID to delete: ");
        int bookIdToDelete = scanner.nextInt();
        // Consume newline
        scanner.nextLine();

        boolean found = false;
        for (Book book : books) 
        {
            if (book.getBookId() == bookIdToDelete) 
            {
                books.remove(book);
                found = true;
                System.out.println("Book deleted successfully!");
                break;
            }
        }
        if (!found)
        {
            System.out.println("Book with ID " + bookIdToDelete + " not found.");
        }
    }
}
