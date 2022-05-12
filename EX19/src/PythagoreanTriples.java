/*
 * 
 * Program Name: PythagoreanTriples.java
 * Last edited on March 31th, 2022
 * By: Lucas Chow
 * ICS3U1
 * 
 * This program prompts the user for a positive integer and then prints out all
 * Pythagorean triplets with c <= user input in form a^2 + b^2 = c^2, a, b and c are positive integers
 * 
 * */
import java.util.Scanner;

public class PythagoreanTriples
{

    public static void main(String[] args)
    {
        //declaring variables
    	int userInt;
        Scanner sc = new Scanner(System.in);
        
        //prompting user for a positive integer
        System.out.print("Enter a positive integer: ");
        userInt = sc.nextInt();
        sc.nextLine();
        
        //prints out the title
        System.out.println("  a^2 +   b^2 =   c^2");
        System.out.println("_____________________\n");
        
        //prints out the primitive Pythagorean triples all numbers <= userInput
        for (int i = 1; i <= userInt; i++)
        	for (int a = 1; a <= i; a++)
        	{
        		for (int b = 1; b <= a; b++)
        		{
        			if (a*a + b*b == i*i)
        			{
        				System.out.printf("%3d^2  + %3d^2 = %3d^2\n",b,a,i);
        			}
        		}
        	}
    }
}