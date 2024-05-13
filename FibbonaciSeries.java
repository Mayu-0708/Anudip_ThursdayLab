package Thrusday_Lab;

public class FibbonaciSeries extends Thread
{
	public static void Fibonacci_Series(int n) 
	{
        int firstTerm = 0;
        int secondTerm = 1;

        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= n; i++)
        {
            System.out.print(firstTerm + ", ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
	public void run()
	{
		Fibonacci_Series(20);
	}
}
