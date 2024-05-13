package Thrusday_Lab_8Feb;
/*
 * 1.Write a method that takes a String and returns a String of the same length containing the 'X' character
 *  in all positions except the last 4 positions.The characters in the last 4 positions must be the same as 
 *  in the original string. For example, if the argument is "12345678", the return value should be "XXXX5678".
 */
import java.util.*;
public class StringReplace
{
	public static void main(String[] args) 
	{
		String original,result;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        original = scanner.nextLine();
        result = replaceWithX(original);
        System.out.println("Result: " + result);
        scanner.close();
    }

    public static String replaceWithX(String str)
    {
        if (str == null || str.length() < 4)
        {
            return str;
        }

        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length() - 4; i++)
        {
            sb.append('X');
        }
        sb.append(str.substring(str.length() - 4));

        return sb.toString();
    }

}