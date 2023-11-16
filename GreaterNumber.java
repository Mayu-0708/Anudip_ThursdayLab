package nov_16;

/*3)Write a program to accept choice from the user and perform the operation
	1.Find out greater between 3 NO
	2.Check given no is even or odd
	3.Check the given character is vowel or not
	4.check the given no is divisible by 5 or not
*/

import java.util.Scanner;
public class GreaterNumber {

	public static void main(String[] args) {
		int num1, num2, num3, choice;
		char c;
		Scanner sc = new Scanner(System.in);
		System.out.println("-------- Option List ---------");
		System.out.println("\t1.Find out greater between 3 NO\r\n"
				+ "	2.Check given no is even or odd\r\n"
				+ "	3.Check the given character is vowel or not\r\n"
				+ "	4.check the given no is divisible by 5 or not");
		System.out.println("Which Operation Do You Want To Perform");
		choice = sc.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println("Find out greater between 3 NO");
				//Accepting Numbers From User
				System.out.println("Enter First Number = ");
				num1 = sc.nextInt();
				System.out.println("Enter First Number = ");
				num2 = sc.nextInt();
				System.out.println("Enter First Number = ");
				num3 = sc.nextInt();
				//Check Which No is Greater Using if else if
				if(num1 >= num2 && num1 >= num3)
					System.out.println("Greater Number is "+num1);
				else if(num2 >= num1 && num2 >= num3)
					System.out.println("Greater Number is "+num2);
				else 
					System.out.println("Greater Number is "+num3);
				break;
			case 2:
				System.out.println("Check Given Number is Even or Odd");
				System.out.println("Enter Any Number to Check Even or Odd");
				num1 = sc.nextInt();
				//if Number is Zero
				if(num1 == 0)
					System.out.println("Number is Zero");
				else
				{
					if(num1 % 2 == 0)
						System.out.println("Given Number is Even");
					else
						System.out.println("Given Number is Odd");
				}
				break;
			case 3:
				System.out.println("Check Given Character is Vowel or not");
				System.out.println("Enter Any Character from a to z");// Accepting Any Character From User
				c = sc.next().charAt(0);
				if(c == 'a' || c =='e' || c == 'i' || c == 'o' || c == 'u')//use Logical or operator
					System.out.println("Given Character is Vowel");
				else
					System.out.println("Given Character is not vowel");
				break;
			case 4:
				System.out.println("check the given no is divisible by 5 or not");
				System.out.println("Enter Any Number = ");
				num1 = sc.nextInt();
				if(num1 % 5 == 0)
					System.out.println(num1 +" is Divisible By 5");
				else
					System.out.println(num1+" is Not Divisible by 5");
				break;
			default:
				System.out.println("Kindly Enter Correct Choice");
				
		}
		sc.close();
	}

}
