/*
 * Write a program to create automobile service( Car Service Center ) by using inheritance ,
 * Encapsulation, Abstraction, Polymorphism
 */

package Thrusday_Lab;

public class Car_Service_Center 
{
	public static void main(String[] args)
	{	
		//Creating Object of Bill_Details 
		Bill_Details bill = new Bill_Details();
		//Calling methods by Using object
		bill.details();        
		bill.services();
		bill.billDetails();
		bill.paymentDetail();
	}
}