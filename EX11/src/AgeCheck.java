/*
 * 
 * Program Name: AgeCheck.java
 * Last edited on March 8th, 2022
 * By: Lucas Chow
 * ICS3U1
 * 
 * This program prompts the user for their age, and if their age is greater
 * or equal to 18, outputs "OLD ENOUGH TO VOTE", otherwise, it outputs the years required for them to vote
 * 
 * */


import java.util.Scanner;

public class AgeCheck	
{
	public static void main(String[] args)
	{
		// variable declaration
		int userAge;
		final int USER_REQUIRED_AGE = 18;
		
		Scanner sc = new Scanner(System.in);
		
		// Prompts user for age
		System.out.print("What is your age? ");
		userAge = sc.nextInt();
		sc.nextLine();
		
		//is user old enough to vote
		if (userAge >= USER_REQUIRED_AGE)
		{
			//outputs "OLD ENOUGH TO VOTE"
			System.out.println("OLD ENOUGH TO VOTE");
		}
		else
		{
			//outputs number of years required to be able to vote
			System.out.println("Not old enough to vote, wait for " + (USER_REQUIRED_AGE - userAge) + " years");
		}
	}
}
