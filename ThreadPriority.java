package Thrusday_Lab;

//Q4. Write a program to set the priorities of the thread.

public class ThreadPriority extends Thread   
{   
 // Whenever the start() method is called by a thread   the run() method is invoked 
 public void run()  
 {  
  System.out.println("Inside the run() method");  
 }    
 public static void main(String argvs[])  
 {   
  ThreadPriority th1=new ThreadPriority();  
  ThreadPriority th2=new ThreadPriority();  
  ThreadPriority th3=new ThreadPriority();  
  ThreadPriority th4=new ThreadPriority();  
  ThreadPriority th5=new ThreadPriority();  
  ThreadPriority th6=new ThreadPriority();  
  
   
  // Display the priority of the thread  
  System.out.println("Priority of the thread th2 is : " + th2.getPriority());    
    
  // Setting priorities of above threads by  
  // passing integer arguments  
  th1.setPriority(MAX_PRIORITY);  
  th2.setPriority(MIN_PRIORITY);  
  th3.setPriority(9);  
  th4.setPriority(7);  
  th5.setPriority(6);  
  th6.setPriority(5);  
  
  
  th1.start();
  th2.start();
  th3.start();
  
  System.out.println("Priority of the thread th1 is : " + th1.getPriority());  
  System.out.println("Priority of the thread th2 is : " + th2.getPriority());  
  System.out.println("Priority of the thread th3 is : " + th3.getPriority());   
  System.out.println("Priority of the thread th1 is : " + th4.getPriority()); 
  System.out.println("Priority of the thread th1 is : " + th5.getPriority()); 
  System.out.println("Priority of the thread th1 is : " + th6.getPriority()); 
 }  
}