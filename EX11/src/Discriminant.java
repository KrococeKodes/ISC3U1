/*
 * 
 * Program Name: Discriminant.java
 * Last edited on March 8th, 2022
 * By: Lucas Chow
 * ICS3U1
 * 
 * This program introduces the form of a discriminant (found in the quadratic formula under the square root)
 * and prompts the user for the variable value of a, b, and c. It then calculates the discriminant 
 * in the form of b^2 - 4ac, then if that value is greater than 0, it will have 2 real roots. If 
 * it is equal to 0, it will have 1 real root. If it is less than 0, it will have 0 real roots. It 
 * will output that value.
 * 
 * */
import java.util.Scanner;

public class Discriminant 
{
	public static void main(String[] args)
	{
		//declaring variables
		int valueA;
		int valueB;
		int valueC;
		double discriminantValue;
		Scanner sc = new Scanner(System.in);
		
		
		//introducing program
		System.out.println("This is the discriminant calculator, in form b^2-4ac");
		
		//prompting user for value of a, b & c
		System.out.print("Enter in value of a: ");
		valueA = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter in value of b: ");
		valueB = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter in value of C: ");
		valueC = sc.nextInt();
		sc.nextLine();
		discriminantValue = Math.pow(valueB, 2) - (4*valueA*valueC);
		
		
		//checking if the discriminant will create 2 real roots, 1 real root, or no real roots, and outputs the # of roots
		if (discriminantValue > 0)
		{
			System.out.println("2 real roots");
		}
		else if (discriminantValue == 0)
		{
			System.out.println("1 real root");
		}
		else
		{
			System.out.println("No real roots");
		}
		
	}
}
