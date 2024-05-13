package Thrusday_Lab;

/*
 * Create an interface called "BankAccount" with methods called "deposit" and "withdraw".
 * Create a class called "CheckingAccount" that implements the BankAccount interface and implements the "deposit" and "withdraw" methods.
 * Create an object of the CheckingAccount class and call both the "deposit" and "withdraw" methods.
 * 1.Create a parent class called "Vehicle" with attributes such as brand, model, year, and a method called "drive".
 * Create a child class called "Car" that inherits from Vehicle and has an additional attribute called "color" and a method called "honk". 
 * Create an object of the Car class and call both the "drive" and "honk" methods.
 */
import java.util.Scanner;
// interface
interface BankAccount
{
	//Abstract Methods
	void deposite();
	void withdraw();
}
// implemented class
class CheckingAccount implements BankAccount
{
	double amount=0,deposite,withdraw;
	Scanner input=new Scanner(System.in);
	@Override
	// deposite method
	public void deposite() 
	{
		System.out.print("Enter deposite amount=");
		amount=input.nextDouble();
		amount+=deposite;
		System.out.println("Amount deposite successfully");
	}

	@Override
	public void withdraw()  // withdraw method
	{
		System.out.print("Enter withdraw amount=");
		amount=input.nextDouble();
		if(amount==0 || deposite>amount)
			System.out.println("Your balance is not withdraw");
		else
			System.out.println("Amount withdraw successfully");
	}
}

class Vehical // parent class 
{
	String brand,model;
	int year;
	Scanner input=new Scanner(System.in);
	public void drive()
	{
		System.out.print("Enter brand=");
		brand=input.next();
		System.out.print("Enter model=");
		model=input.next();
		System.out.print("Enter year=");
		year=input.nextInt();
		
	}
}
//child class of Vehical class
class Car extends Vehical 
{
	String color;
	public void hunk()
	{
		System.out.print("Enter color=");
		color=input.next();
		
	}
	void display()
	{
		super.drive();
		hunk();
		System.out.println("Brand="+brand);
		System.out.println("Model="+model);
		System.out.println("Year="+year);
		System.out.println("Color="+color);
	}
}
public class Vehicle_Interface
{
	public static void main(String[] args) 
	{
		//Creating Object of class
		CheckingAccount obj=new CheckingAccount();
		//Calling Methods
		obj.deposite();
		obj.withdraw();
		Car obj1=new Car();
		obj1.display();
	}
}
