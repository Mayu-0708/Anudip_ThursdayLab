/*
 *  Q 3. Write a program to demonstrate the chained exception in Java.
 */

package Thrusday_Lab;
import java.io.IOException;
public class ChainedException 
{
	//Chained Exception
    public static void main(String[] args) throws Throwable {
        try 
        {
            throw new ArithmeticException("Top Level Exception.")
              .initCause(new IOException("Input Output caused Exception."));
        }
        catch(ArithmeticException ae) 
        {
            System.out.println("Caught : " + ae);
            System.out.println("Actual cause: "+ ae.getCause());
        }
    }    
}