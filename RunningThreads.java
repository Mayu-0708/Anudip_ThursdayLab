package Thrusday_Lab;

//Q3. Write a program to display all running threads in Java.

class MyThreads extends Thread 
{
	//Override the run method from runable interface
    @Override
    public void run() 
    {
        System.out.println(Thread.currentThread().getName()+" is running");
    }
}
class RunningThread 
{
      @SuppressWarnings("static-access")
	public static void main(String[] args)
      {
          try 
          {
        	  //Creating threads with differen names
              MyThreads thread0 = new MyThreads();
              MyThreads thread1 = new MyThreads();
              MyThreads thread2 = new MyThreads();
              MyThreads thread3 = new MyThreads();
              MyThreads thread4 = new MyThreads();
              MyThreads thread5 = new MyThreads();
              
              //Calling threads using start() method and sleep() methode
              thread0.start();
              thread1.sleep(0);
              thread2.start();
              thread3.sleep(0);
              thread4.start();
              thread5.start();
              
          }
          catch(InterruptedException ie)
          {
        	  //throw exception when interrupt is occured
        	  System.out.println(ie.getMessage());
          }
          
      }
}