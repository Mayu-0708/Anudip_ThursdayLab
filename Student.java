//3. Create a arraylist of students name and remove name of students who start with ‘S’
//using lambda expression.

package Thrusday_Lab_15Feb;
import java.util.*;
public class Student
{
	//Creating Array List
	 ArrayList<String> students=new ArrayList<>();
	 String name;
	 //Method for Remove S
	 public void removeNameStartWith_S()
	 {
		  int num,i;
		  Scanner sc=new Scanner(System.in);
		  //Accepting number of students from user
		  System.out.println("How many students you want: ");
		  num=sc.nextInt();
		  
		  for(i=0;i<num;i++)
		  {
			   System.out.println("Enter student name: ");
			   name=sc.next();
			   
			   students.add(name);
		  }
		 //Remove S logic
		  students.removeIf(name -> name.startsWith("S") || name.startsWith("s"));
		  
		  System.out.println("Updated Student Names:");
		        for (String name : students)
		        {
		            System.out.println(name);
		        }
	 }
	 //Main Method
	 public static void main(String[] args)
	 {
		 Student obj=new Student();
		 obj.removeNameStartWith_S();
	 }
}
