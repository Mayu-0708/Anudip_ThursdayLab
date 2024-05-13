package Thrusday_Lab;

public class ThreadUse 
{
	public static void main(String []args) 
	{
		//Creating Thread for Reverse class
		Reverse reverseThread = new Reverse();
		
		//Creating Thread for Fibbonacci Series
		FibbonaciSeries FibSeriseThread = new FibbonaciSeries();
		
		//Start Executing the threads
		reverseThread.start();
		FibSeriseThread.start();
		
		//Stop Executing the threads
	}
}
