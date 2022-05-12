/*
 * 
 * Program Name: Driving.java
 * Last edited on March 8th, 2022
 * By: Lucas Chow
 * ICS3U1
 * 
 * This program prompts the user of their age, and checks if it is in 
 * the inclusive age range of 18-75. If it is, it outputs 
 * "Age OK. Have you got a driver's license?". Otherwise, if under 18
 * or over 75 it will "Too young to drive" or "
 * "Sorry you are over the legal age limit for driving" respectively
 * 
 * */
import java.util.Scanner;

public class Driving 
{

	public static void main(String[] args)
	{
		//declaring variables
		int userAge;
		Scanner sc = new Scanner(System.in);
		
		
		//prompting user
		System.out.print("What is your age?: ");
		userAge = sc.nextInt();
		sc.nextLine();
		
		//checks and outputs if driver is in the legal age range of driving
		if (userAge < 18)
		{
			System.out.println("Too young to drive");
		}
		
		if (userAge > 75)
		{
			System.out.println("Sorry you are over the legal age limit for driving");
		}
		else
		{
			System.out.println("Age OK. Have you got a driver's license?");
		}
	}
}

