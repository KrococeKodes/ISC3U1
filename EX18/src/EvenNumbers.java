/*
 * 
 * Program Name: EvenNumbers.java
 * Last edited on March 25th, 2022
 * By: Lucas Chow
 * ICS3U1
 * 
 * This program continuously prompts the user for a positive number,
 * stopping when a non-positive number is entered, and outputs the number of even numbers
 * 
 * */
import java.util.Scanner;

public class EvenNumbers
{

    public static void main(String[] args)
    {
        //declaring variables
    	int userInt, evenNumbers;
        Scanner sc = new Scanner(System.in);
        
        //Continuously prompting user for an integer until they enter a non-positive number
        evenNumbers = 0;
        do {
        	System.out.print("Enter an integer: ");
        	userInt = sc.nextInt();
        	sc.nextLine();
        	if (userInt > 0)
        	{
        		if (userInt % 2 == 0 )
        		{
        			evenNumbers++;
        		}
        			
        	}
        } while (userInt > 0);
        
        //Outputting the number of entered even numbers
        System.out.printf("You have entered %d even numbers", evenNumbers);
    }
}