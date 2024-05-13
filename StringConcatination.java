package Thrusday_Lab_8Feb;
/*
 * 2.Write a method that takes a String[] as an argument and returns a String containing the concatenation
 * of all the strings in the input array. Invoke your method 3 times with different arguments.
 * Make sure that your code handles the cases where the argument is null.
 */
import java.util.*;
public class StringConcatination
{
	public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);

        // Input 1
        System.out.println("Enter strings separated by space:");
        String[] arr1 = scanner.nextLine().split(" ");
        System.out.println("Concatenated String 1: " + concatenateStrings(arr1));

        // Input 2
        System.out.println("Enter strings separated by space (or leave it blank for null):");
        String input2 = scanner.nextLine();
        String[] arr2 = input2.isEmpty() ? null : input2.split(" ");
        System.out.println("Concatenated String 2: " + concatenateStrings(arr2));

        // Input 3
        System.out.println("Enter strings separated by space:");
        String[] arr3 = scanner.nextLine().split(" ");
        System.out.println("Concatenated String 3: " + concatenateStrings(arr3));

        scanner.close();
    }

    public static String concatenateStrings(String[] arr)
    {
        if (arr == null)
        {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for (String str : arr)
        {
            if (str != null) 
            {
                sb.append(str);
            }
        }
        return sb.toString();
    }
}
