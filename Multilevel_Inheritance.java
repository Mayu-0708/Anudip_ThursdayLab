package Thrusday_Lab;

/*Write a program to do the process by using inheritance. create a class which will
 *  having the process of prime number  series, check the given no is palindrome number.
 *   Create another class which will check the given no is armstrong number or not .
 *   and also will display the following pattern
 
generate below pattern


1      
121
12321
1234321
Multilevel Inheritance

*/


import java.util.*;
//Prime Number Class
class PrimeNumber
{
	 Scanner input = new Scanner(System.in);
	 int num, i, j, flag, temp, lastDigit, reverse = 0, count = 0;
	 double sum = 0;
	 public void prime()
	 {
		  System.out.println("........Prime class..........");
		  System.out.print("Enter the number = ");
		  num = input.nextInt();
		  //Prime Number Logic
		  flag = 0;
		  for(i=2;i<num;i++)
		  {
			   if(num % i == 0)
			   {
				    flag = 1;
				    break;
			   }
		  }
		  if(flag == 0)
		   System.out.println(num+" is prime number");
		  else
		   System.out.println(num+" is not prime number");
	 }
}
//Palindrome Class
class Palindrome extends PrimeNumber
{
	 public void palindrome()
	 {
		  super.prime();
		  System.out.println(".........Palindrome class ..........");
		  System.out.println("Enter the number=");
		  num = input.nextInt();
		  //Palindrome Number Logic
		  temp = num;
		  while(temp > 0)
		  {
			   lastDigit = temp % 10;
			   reverse = lastDigit + (reverse * 10);
			   temp/=10;
		  }
		  if(reverse == num)
			  System.out.println(num+" is palindrome number");
		  else
			  System.out.println(num+" is not palindrome number");
	 }
}
//Armstrong class Which Extends Palindrome Class
class Armstrong extends Palindrome
{
 public void armstrong()
 {
	  super.palindrome();
	  System.out.println(".........Armstrong class..........");
	  System.out.print("Enter Number = ");
	  num = input.nextInt();
	  temp = num;
	  while(temp > 0)
	  {
		   count++;
		   temp /= 10;
	  }
	  temp = num;
	  while(temp > 0)
	  {
		   lastDigit = temp%10;
		   sum = sum + Math.pow(lastDigit,count);
		   temp /= 10;
	  }
	  if(sum == num)
		  System.out.println(num+" is armstrong number");
	  else
		  System.out.println(num+" is not armstrong number");
	 }
}
//Pattern Class Which Extends Armstrong class
class Pattern extends Armstrong
{
	 public void pattern()
	 {
		  super.armstrong();
		  System.out.println("....... Pattern class ..........");
		  for(i = 1; i <= 4; i++)
		  {
			   for(j = 1; j <= 4-i; j++)
				   System.out.print(" ");
			   for(j = 1; j <= i; j++)
				   System.out.print(j);
			   for(j = i-1; j >= 1; j--)
				   System.out.print(j);
			   System.out.println();
		  }
	 }
}
//Class Which contain main Method
public class Multilevel_Inheritance 
{
	 public static void main(String[] args) 
	 {
		 //Creating Object of Pattern Class Which inherit the Properties of All other Classes
		  Pattern obj=new Pattern();
		  obj.pattern();
	 }

}