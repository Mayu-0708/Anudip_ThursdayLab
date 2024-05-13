package Thrusday_Lab;


//abstraction and inheritance
//CarUse Class Extends properties of Car_Details class
abstract class CarUser extends Car_details     
{
	//Polymorphism(method override)  
	@Override
	public void details()                
	{
		//Accepting Customer Details
		System.out.println("Enter customer name: ");
		name=sc.next();
		System.out.println("Enter customer age: ");
		age=sc.nextInt();
		System.out.println("Enter customer phone number: ");
		setphone_no(sc.nextLong());
		//calling super class method using super keyword
		super.details();
	}
	
	abstract void services();
}