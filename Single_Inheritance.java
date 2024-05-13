package Thrusday_Lab;
/*
 * Q5)Create a parent class called "Person" with attributes such as name, age, and a method called "speak".
 *  Create a child class called "Student" that inherits from Person and has an additional attribute called "grade" and a method called "study".
 * Create an object of the Student class and call both the "speak" and "study" methods.
 */

class Parent   // Superclass
{
	String name = "Mayuri";
	int age = 19 ;
	void speak()
	{
		System.out.println("Name of Student = "+name);
		System.out.println("Age of Student = "+age);
	}
}

class Student extends Parent // subclass of Parent class
{
	char grade='O';
	void study()
	{
		super.speak();  // calling superclass methods
		System.out.println("Grade of Student = "+grade);
	}
}
public class Single_Inheritance {

	public static void main(String[] args) 
	{
		//Creating object of Student Class
		Student obj=new Student();
		obj.study();
	}

}

