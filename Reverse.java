package Thrusday_Lab;
//To display 1 to 9999 in reverse order.
public class Reverse extends Thread
{
	public void run()
	{
		int i;
		
		for(i = 9999; i > 0; i--)
		{
			System.out.println(i);
		}
	}

}
