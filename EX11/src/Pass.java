/*
 * Program Name: Test.java
 * Last edited on March 8th, 2022
 * By: Lucas Chow
 * ICS3U1
 * 
 * This program ask the user for the sum of 34 + 45, and checks if their input
 * is the same value as the correct output (79). If so, it prints "Correct". Else,
 * it prints "Not correct"
 * 
 * */
import java.util.Scanner;

public class Pass 
{
	public static void main(String[] args)
	{
		//declaring variables
		int input;

		Scanner sc = new Scanner(System.in);
		
		//prompts user for value of answer
		System.out.print("What is the value of 34 + 45 =  ");
		input = sc.nextInt();
		sc.nextLine();
		
		
		//checks if input is 79, if yes, output "Correction" if not, output "Not correct"
		if (input == 79)
		{
			System.out.println("Correct");
		}
		else
		{
			System.out.println("Not correct");
		}
		
	}
}
