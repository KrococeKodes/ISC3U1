/*
 * 
 * Program Name: Test.java
 * Last edited on March 8th, 2022
 * By: Lucas Chow
 * ICS3U1
 * 
 * This program test if the test mark is over 100 (above range) or below 0 (below range)
 * It also outputs if the mark is greater or equal than 0 and less than 50 (failing)
 * If it is greater or equal to 50 and less or equal to 100 (passing)
 * 
 * */

import java.util.Scanner;

public class Test 
{
	public static void main(String[] args)
	{
		//declaring variables
		int testMark;
		Scanner sc = new Scanner(System.in);
		
		//prompting user for their test mark
		System.out.print("Please enter a test mark: ");
		testMark = sc.nextInt();
		sc.nextLine();
		
		//checking if test mark is > 100, < 0, or between 50 and 100 and between 0 and 50.
		
		if (testMark > 100)
		{
			System.out.println("Test mark is > 100 (Above range)");
		}
		else if (testMark < 0)
		{
			System.out.println("Test mark is < 0 (Below range)");
		}
		else if (testMark >= 50 && testMark <= 100)
		{
			System.out.println("Passing");
		}
		else if (testMark < 50 && testMark >= 0)
		{
			System.out.println("Failing");
		}
		
	}
}
