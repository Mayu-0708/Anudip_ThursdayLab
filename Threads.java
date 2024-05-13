/*
 * Q 1. Write a program that creates 2 threads - each displaying a msg
        (Pass the msgas a parameter to the constructor). 
        The threads should display the messages continuously till the user presses ctrl+c.

 */
package Thrusday_Lab;
//Extend class Thread by Threads
public class Threads extends Thread {
    private String msg;

    public Threads(String msg)
    {
        this.msg= msg;
    }

    public static void main(String[] args)
    {
        try 
        {
            // Create two threads with different messages
            Threads thread1 = new Threads("Thread 1: Hello!");
            Threads thread2 = new Threads("Thread 2: Hi!");

            // Start the threads
            thread1.start();
            thread2.start();

            // Wait for user to press Ctrl+C
            while (true)
            {
                Thread.sleep(100); // Adjust sleep duration as needed
            }
        } catch (InterruptedException e) 
        {
            // Main thread interrupted, exit gracefully
        }
    }
    public void run()
    {
        try 
        {
            while (true)
            {
                System.out.println(msg);
                Thread.sleep(100); // Adjust sleep duration as needed
            }
        } 
        catch (InterruptedException e)
        {
            // Thread interrupted, exit gracefully
        }
    }

   
}
