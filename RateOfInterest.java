package nov_16;
/*2)Write a program to accept age and gender from the user and check the ROI according to condition
above 60
M: 7%
F: 7.5%
below 60
M,F: 5% */

import java.util.Scanner;
public class RateOfInterest {

	public static void main(String[] args) {
		int age;
		char gender;
		Scanner sc = new Scanner(System.in);
		System.out.println("Find Rate Of Interest \n");
		System.out.println("Enter Your Age : ");//Accepting Age From User
		age = sc.nextInt();
		System.out.println("Enter Your Gender : ");//Accepting Gender From User
		gender = sc.next().charAt(0);
		 //For Above 60
		if(age >= 60)
		{
			if(gender ==  'F' || gender == 'f') 
				System.out.println("Your Rate of Interest is 7.5%");
			else if(gender == 'M' || gender == 'm')
				System.out.println("Your Rate of Interest is 7%");
			else
				System.out.println("Enter Proper Gender");
		}
		//For Below 60
		else if(age < 60 && age > 0)
		{
			System.out.println("Your Rate of Interest is 5%");
		}
		else
			System.out.println("Kindly Enter Your Correct Age");
		sc.close();
	}

}
