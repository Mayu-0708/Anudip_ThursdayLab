package Thrusday_Lab;

//Custom exception class for book not available
class BookNotAvailableException extends Exception 
{
	 public BookNotAvailableException(String message) 
	 {
	     super(message);
	 }
}