package Thrusday_Lab;

import java.util.*;
class Car_details
{
	Scanner sc=new Scanner(System.in);
	public String name,model;
	public int age,year,car_num;
	private long phone_no;                       
	
	//Encapsulation
	public void details()              
	{
		//Accepting car details from customer
		System.out.println("Enter car model : ");
		model=sc.next();
		System.out.println("Enter car Number : ");
		car_num=sc.nextInt();
		System.out.println("Enter car Manufacture Year : ");
		year=sc.nextInt();
	}
	
	//use of encapsulation for mobile number
	public long getphone_no() {
		return phone_no;
	}

	public void setphone_no(long phone_no) {
		this.phone_no = phone_no;
	}
}