package Thrusday_Lab;

/*
 * Q3)Design a class named ShowRoom with the following description: Instance variables/data members:
String name: to store the name of the customer.
 long phone_no: to store the mobile number of the customer.
double cost: to store the cost of the items purchased. double dis: to store the discount amount.
double amount: to store the amount to be paid after discount.
Member methods:
 ShowRoom(): default constructor to initialize data members.
void input(): to input customer name, mobile number, cost.
void calculate(): to calculate discount on the cost of purchased items, based on the following criteria:
COSTDISCOUNT (IN PERCENTAGE) 
<=to Rs. 10000                                       5%
> Rs. 10000 <=Rs. 20000                             10%
> Rs. 20000 <= Rs. 35000                           15%
> Rs. 35000                                          20%
 void display(): to display customer name, mobile number, amount to be paid after discount.
 Write a main() method to create an object of the class and call the above member methods.
 */

import java.util.Scanner;

public class ShowRoom 
{
	String name;
	long Phone_no;
	double cost,discount;
	Scanner input=new Scanner(System.in);
	
	// default constructor for initialize the attributes
	ShowRoom() 
	{
		name=" ";
		Phone_no=1234567890;
		cost=123.321;
		discount=123;
	}
	
	// accepting input from user
	public void input() 
	{
		System.out.print("Enter Customer name=");
		name=input.next();
		System.out.print("Enter Customer mobile number=");
		Phone_no=input.nextLong();
		System.out.print("Enter item cost=");
		cost=input.nextDouble();
	}
	
	 // calculating discount
	public void calculate()
	{
		if(cost<=10000)
		{
			System.out.println("Congratulations....!! You have 5% discount");
			discount=cost*0.05;
		}
		else if(cost>10000 && cost<=20000)
		{
			System.out.println("Congratulations....!! You have 10% discount");
			discount=cost*0.10;
		}
		else if(cost>20000 && cost<=35000)
		{
			System.out.println("Congratulations....!! You have 15% discount");
			discount=cost*0.15;
		}
		else
		{
			System.out.println("Congratulations....!! You have 20% discount");
			discount=cost*0.20;
		}
	}
	
	// printing bills
	public void display()
	{
		System.out.println("********** YOUR BILL ************");
		System.out.println("Name="+name);
		System.out.println("Mobile no="+Phone_no);
		System.out.println("Cost="+cost);
		System.out.println("Discount price="+discount);
		System.out.println("Paid price="+(cost-discount));
	}
	
	//Main Method
	public static void main(String[] args) 
	{
		ShowRoom obj=new ShowRoom();//Object of ShowRoom Class
		// calling methods
		obj.input();
		obj.calculate();
		obj.display();
	}
}