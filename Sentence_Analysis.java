/*
 Q4)WAP to enter any sentence and calculate the following:
 a) Total number of digits present in it.
 b) Total number of small letters and capital letters present in it.
 c) Total number of alphabets used in it.
 d) Total number of special character used in it.
 e) Total number of vowels presents in it.
 f) Total Number words present in that sentence.
 */
package Thrusday_Lab;
import java.util.*;
public class Sentence_Analysis
{
	static String sentence;
	public static void Accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Sentence : ");
		sc.nextLine();
		sentence = sc.nextLine();
	}
	// Method to count digits in a sentence
    public static void countDigits() 
    {
    	Accept();
    	  // Task (a): Total number of digits
        int digitCount = 0,i;
        char character;
        for (i=0;i<sentence.length();i++) 
        {
         character=sentence.charAt(i);
            if (Character.isDigit(character)) 
            {
                digitCount++;
            }
        }
        System.out.println("Total number of digits: " + digitCount);
    }
    
 // Method to count lowercase and uppercase letters in a sentence
    public static void countLetters()
    {
    	 Accept();
    	 int smallLetterCount = 0, capitalLetterCount=0, totalAlphabets,i;
         char character;
         for (i=0;i<sentence.length();i++) 
         {
          character=sentence.charAt(i);
          // Task (b): Total number of small letters and capital letters
          if (character>='A' && character<='Z')
             {
              capitalLetterCount++;
             }
             else if (character>='a' && character<='z')
             {
              smallLetterCount++;
             }
         }
         
         System.out.println("Total number of small letters: " + smallLetterCount);
         
         System.out.println("Total number of capital letters: " + capitalLetterCount);
         
         // Task (c): Total number of alphabets use
         totalAlphabets=smallLetterCount+capitalLetterCount;
         System.out.println("Total number of alphabets: " + totalAlphabets);
    }
    
 
 // Method to count vowels in a sentence
    public static void countVowels()
    {
       Accept();
        int vowelCount = 0,i;
        char character;
     // Task (e): Total number of vowels
        String vowels = "aeiouAEIOU";

        for (i=0;i<sentence.length();i++) 
        {
         character=sentence.charAt(i);
            if (vowels.indexOf(character) != -1) 
            {
                vowelCount++;
            }
        }
        
        System.out.println("Total number of vowels: " + vowelCount);
    }
    
 // Method to count alphabets in a sentence
    public static void countAlphabets()
    {
       Accept();
        int alphabetCount = 0,i;
        char ch;

        // Iterate through each character in the sentence
        for (i = 0; i < sentence.length(); i++)
        {
            ch = sentence.charAt(i);

            // Check if the character is an alphabet (either uppercase or lowercase)
            if (Character.isLetter(ch))
            {
                alphabetCount++;
            }
        }

        System.out.println("Total number of alphabets in the sentence: " + alphabetCount);
    }

 // Method to count special characters in a sentence
    public static void countSpecialCharacters()
    {
        Accept();
        int specialCharacterCount = 0, i;
        char character;
        // Task (d): Total number of special characters
           for (i=0;i<sentence.length();i++) 
           {
            character=sentence.charAt(i);
               if (!Character.isLetterOrDigit(character)) 
               {
                   specialCharacterCount++;
               }
           }
           
           System.out.println("Total number of special characters: " + specialCharacterCount);
    }
    
    // Method to count words in a sentence
    public static void countWords()
    {
       Accept();
        int wordCount = 0,i;
       
        for (i = 0; i < sentence.length(); i++)
        {
            // Check if the character is a space 
            if (sentence.charAt(i) == ' ')
            {
            	wordCount++;
            }
        }
        System.out.println("Total number of words in the sentence: " + wordCount);
    }
    
    //Method for user choice
    public static void user_choice()
    {
    	int choice;
    	char Answer;
    	Scanner sc = new Scanner(System.in);
		do
    	{
        	System.out.println("1) Total number of digits present in sentence.\n"
        			+ "  	 2) Total number of small letters and capital letters present in sentence.\n"
        			+ " 	 3) Total number of alphabets used in sentence.\n"
        			+ " 	 4) Total number of special character used in sentence.\n"
        			+ " 	 5) Total number of vowels presents in sentence.\n"
        			+ "  	 6) Total Number words present in that sentence.");
        	System.out.println("Enter your choice : ");
        	choice = sc.nextInt();
	    	switch(choice)
	    	{
	    		case 1:
	    			countDigits();
	    			break;
	    			
	    		case 2:
	    			countLetters();
	    			break;
	    		
	    		case 3:
	    			countAlphabets();
	    			break;
	    			
	    		case 4:
	    			countSpecialCharacters();
	    			break;
	    		case 5:
	    			countVowels();
	    			break;
	    			
	    		case 6:
	    			countWords();
	    			break;
	    			
	    		default:
	    			System.out.println("Enter Valid Choice...");
	    	}
	    	System.out.println("Do you want to perform any other operation ?(yes/no) : ");
	    	Answer = sc.next().charAt(0);
    	}
    	while(Answer == 'y' || Answer == 'Y');
    }
    
    public static void main(String []args)
    {
    	user_choice();
    }
}