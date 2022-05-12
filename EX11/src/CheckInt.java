/*
 * 
 * Program Name: CheckInt.java
 * Last edited on March 8th, 2022
 * By: Lucas Chow
 * ICS3U1
 * 
 * This program prompts the user for an integer, and checks if it is positive or negative or neither, 
 * even or odd, and if it is a multiple of 7 or not, and outputs those statements
 * 
 * */
import java.util.Scanner;

public class CheckInt
{
	public static void main(String[] args)
	{
		//declaring variables
		int userInput;
		Scanner sc = new Scanner(System.in);
		//prompts user for integer
		System.out.print("Enter an integer: ");
		userInput = sc.nextInt();
		sc.nextLine();
		
		//Prints out original number
		System.out.println(userInput);
		
		//checks if number is positive, negative, or neither, and outputs the value
		if (userInput > 0 )
		{
			System.out.println("The number is positive");
		}
		else if (userInput < 0 )
		{
			System.out.println("The number is negative");
		}
		else
		{
			System.out.println("The number is neither negative nor positive");
		}
		
		
		//checks if the number is even or odd, and outputs if the number is even or odd
		if (userInput % 2 == 0)
		{
			System.out.println("The number is even");
		}
		else
			System.out.println("This number is odd");
		
		
		//checks is the number is a multiple of 7 or not a multiple of 7
		if (userInput % 7 == 0)
		{
			System.out.println("The number is a multiple of 7");
		}
		else 
		{
			System.out.println("This number is not a multiple of 7");
		}
		
	}
}