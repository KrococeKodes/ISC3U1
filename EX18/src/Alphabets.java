/*
 * 
 * Program Name: Alphabets.java
 * Last edited on March 25th, 2022
 * By: Lucas Chow
 * ICS3U1
 * 
 * This program continuously ask the user for an alphabet, and stops when a non-alphabet is entered
 * It then outputs the number of upper case, lower case, and vowels entered by the user
 * 
 * */
import java.util.Scanner;

public class Alphabets
{

    public static void main(String[] args)
    {
        //declaring variables
    	String upperLetters, lowerLetters, vowels, initialInput;
    	char userInput;
    	int numUpper, numLower, numVowels;
    	boolean isLower, isLetter;
        Scanner sc = new Scanner(System.in);
        
        //initializing variables to loop through
        upperLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        lowerLetters = "abcdefghijklmnopqrstuvwxyz";
        vowels = "aeyuio";
        
        //initializing counter
        numUpper = numLower = numVowels = 0;
        
        //prompting user to enter an alphabet, and checking if the input is a char, and if is a vowel, upper case, lower case, or neither
        do {
        	do {
        		System.out.print("Enter an alphabet: ");
                initialInput = sc.next();
                if (initialInput.length() > 1)
                {
                	System.out.println("Please enter a single character");
                	userInput = 'a';
                }
                else
                {
                	userInput = initialInput.charAt(0);
                }
        	} while (initialInput.length() > 1);
            
            
          isLetter = false;
          {
        	  isLower = true;
              for (int i = 0; i < 6; i++)
              {
              	
              	if (userInput == vowels.charAt(i))
              	{
              		numVowels++;
              		isLetter = true;
              	}
              }
              for (int i = 0; i < 26; i++)
              {	
              	if (userInput == upperLetters.charAt(i))
              	{
              		numUpper++;
              		isLower = false;
              		isLetter = true;
              	}
              }
              if (isLower = true)
              {
            	for (int i = 0; i < 26; i++)
            	{
            		if (userInput == lowerLetters.charAt(i))
                  	{
                  		numLower++;
                  		isLetter = true;
                  	}
            	}
              	
              }
          }           
        } while (isLetter);
        
        //outputs the number of upper case, lower case, and vowels
        System.out.printf("You have entered %d upper case alphabets\n",numUpper);
        System.out.printf("You have entered %d lower case alphabets\n",numLower);
        System.out.printf("You have entered %d vowels\n",numVowels);
        
        
    }
}