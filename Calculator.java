package Thrusday_Lab;

/*
 * Q2)WAP to create a min calculator ask the user what operation the user wants to perform, 
 * and repeat the task till the user wants to perform any operation.
 */


import java.util.Scanner;
public class Calculator {
	
	static int num1,num2,result,choice;
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("*********** CALCULATOR *************\n\n");
		Calculator obj = new Calculator();
		obj.User_Choice();
	}
	//Function For User Choice 
		public void User_Choice()
		{
			char answer;
			do
			{	
				System.out.println("---------- MENU -----------\n");
				System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Division\n5.Modulus\n6.Exit");
				System.out.println("\nSelect Operation Which You Want to Perform :  ");
				choice = sc.nextInt();
				switch(choice)
				{
					case 1:
						Addition();
						break;
					case 2:
						Substraction();
						break;
					case 3:
						Multiplication();
						break;
					case 4:
						Division();
						break;
					case 5:
						Modulus();
						break;
					case 6:
						System.exit(0);
					default:
						System.out.println("Please Enter Valid Choice.... ");
				}
				System.out.println("Do You Want To Perform Any Other Operation : ");
				answer = sc.next().charAt(0);
			}
			while(answer == 'y' || answer == 'Y');
		}
		//Function To Accept The Input From User
		public void Accept()
		{
			System.out.println("Enter First Number :  ");
			num1 = sc.nextInt();
			System.out.println("Enter Second Number :  ");
			num2 = sc.nextInt();
		}
		
		//Function For Addition Of Numbers
		public void Addition()
		{
			Accept();
			result = num1 + num2;
			System.out.println("Addition of "+num1+" and "+num2+" is  "+result);
		}
		
		//Function For Subtraction of Two Numbers
		public void Substraction()
		{
			Accept();
			result = num1 - num2;
			System.out.println("Substraction of "+num1+" and "+num2+" is  "+result);
		}
		
		//Function For Multiplication of Two Numbers
		public void Multiplication()
		{
			Accept();
			result = num1 * num2;
			System.out.println("Multiplication of "+num1+" and "+num2+" is  "+result);
		}
		
		//Function For Division Of Two Numbers 
		public void Division()
		{
			Accept();
			result = num1 / num2;
			System.out.println("Division of "+num1+" and "+num2+" is  "+result);
		}
		
		//Function to get Remainder Of Two Numbers 
		public void Modulus()
		{
			 Accept();
			 result = num1 % num2;
			 System.out.println( num1+" % "+num2+"  =  "+result);
		}
}

