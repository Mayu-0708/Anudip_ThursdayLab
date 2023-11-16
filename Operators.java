package nov_16;
/*1)Write a program to accept choice from the user and display the output
	1.Arithmetic operator
	2.Logical Operator
	3.Relational Operator
	4.Bitwise Operator
	5.Conditional Operator
	6.Assignment Operator*/
import java.util.Scanner;
public class Operators {

	public static void main(String[] args) {
		int num1, num2, choice,result;
		boolean a = true, b = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("--------- Operators ----------");
		System.out.println("\r1.Arithmetic operator\r\n"
				+ "	2.Logical Operator\r\n"
				+ "	3.Relational Operator\r\n"
				+ "	4.Bitwise Operator\r\n"
				+ "	5.Conditional Operator\r\n"
				+ "	6.Assignment Operator");
		System.out.println("Choose The Operation You Want To Perform");
		choice = sc.nextInt();
		switch(choice)
		{
			case 1:
				//Accept two numbers from user
				System.out.println("Accept First Number : ");
				num1 = sc.nextInt();
				System.out.println("Accept Second Number : ");
				num2 = sc.nextInt();
				System.out.println("Arithmetic Operations");
				System.out.println("Addition of First and Second Number= "+ (num1 + num2));//Addition
				System.out.println("Subtraction of First And Second Number = "+ (num1 - num2));//Substraction
				System.out.println("Multiplication of First And Second Number = "+ (num1 * num2));//Multiplication
				System.out.println("Division of Second And First Number = "+ (num2/num1));//Division
				System.out.println("Modulus = "+ (num2 % num1));//Modulus
				break;
			case 2:
				System.out.println("Logical Operations");
				//logical and (&&)
				System.out.println("Logical and (True && False ) = "+(a && b));
				//logical or(||)
				System.out.println("Logical or (True || False ) = "+(a || b));
				//logical not(!)
				System.out.println("Logical Not \n( ! True ) = "+(!a));
				System.out.println("(! False) = " +(!b));
				break;
			case 3:
				System.out.println("Relational Operator");
				//Accepting NUmber From User
				System.out.println("Enter First Number : ");
				num1 = sc.nextInt();
				System.out.println("Enter Second Number : ");
				num2 = sc.nextInt();
				if(num1 == num2)
					System.out.println("First And Second Number are Equal");
				else if(num1 != num2)
				{
					if(num1 > num2)
						System.out.println(num1+" is Greater Than "+num2);
					else if(num1 < num2)
					{
						System.out.println(num1+" is Less Than "+num2);
					}
				}
				break;
			case 4:
				System.out.println("Bitwise Operator");
				System.out.println("Enter First Number = ");
				num1 = sc.nextInt();
				System.out.println("Enter Second Number = ");
				num2 = sc.nextInt();
				
				//------------Bitwise & (and) -------------
				result = num1 & num2;
				System.out.println("Result of &(and) Operator = "+result);
				
				//-----------Bitwise | (or) --------------
				result = num1 | num2;
				System.out.println("Result of |(or) Operator = "+result);
				
				//-----------Bitwise ^ (XOR) --------------
				result = num1 ^ num2;
				System.out.println("Result of ^(xor) Operator = "+result);
				break;
			case 5:
				System.out.println("Conditional Operator");
				System.out.println("Enter First Number = ");
				num1 = sc.nextInt();
				System.out.println("Enter Second Number = ");
				num2 = sc.nextInt();
				//----------Conditional Operator -------------
				result = (num1 > num2) ? num1 : num2;
				System.out.println("Result is "+result);
				break;
			case 6:
				System.out.println("Assignment Operator");
				//Accepting Number From User
				System.out.println("Enter First Number = ");
				num1 = sc.nextInt();
				System.out.println("Enter Second Number = ");
				num2 = sc.nextInt();
				num1 += num2;
				System.out.println("num1 + num2 = "+num1);
				System.out.println("num1 - 5"+(num1 -= 5));
				System.out.println("num1 * 5"+(num1 *= 5));
				System.out.println("num1 / 5"+(num1 /= 5));
				break;
			default:
				System.out.println("Please Enter Valid Choice");
		}
		sc.close();
	}

}
