/*
  Q5)Write a program in Java to accept a word/a String and display the new string after removing 
   all the vowels present in it.
	Sample Input: COMPUTER APPLICATIONS
	Sample Output: CMPTR PPLCTNS
 */
package Thrusday_Lab;

import java.util.*;

public class RemoveVowels
{
	 private static String removeVowels() 
     {
       Scanner input=new Scanner(System.in);
       String str;
          System.out.print("Enter a string=");
          str = input.nextLine();
          input.close();
         // Use regular expression to remove vowels
         return str.replaceAll("[aeiouAEIOU]", "");
     }
     
     public static void main(String[] args) 
     {
         // Display the result
         System.out.println("String without vowels:" + removeVowels());
     }

}
