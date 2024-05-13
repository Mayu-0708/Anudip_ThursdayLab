package Thrusday_Lab;

import java.util.*;
public class EmployDetails
{
	 String name, Country;
     double empsal;
	 boolean isIndian;
	@SuppressWarnings("resource")
	public void Accept()
	{
		//Accepting Employee Details 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee Name : ");
		name = sc.nextLine();
		System.out.println("Enter Employee Sallery : ");
		empsal = sc.nextDouble();
		//Accepting employee is Indian or Not
		System.out.println("Is employee indian(true/false) : ");
		isIndian=sc.nextBoolean();
		
		
	
	}
}
