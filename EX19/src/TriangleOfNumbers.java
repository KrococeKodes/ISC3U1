/*
 * 
 * Program Name: TriangleOfNumbers.java
 * Last edited on March 31th, 2022
 * By: Lucas Chow
 * ICS3U1
 * 
 * This program uses nested loops to print a pyramid of numbers 5 rows incrementally going up 5 columns
 * 
 * */
import java.util.Scanner;

public class TriangleOfNumbers
{

    public static void main(String[] args)
    {
        //declaring variables
        Scanner sc = new Scanner(System.in);
        
        //prints out the number pyramid
        for (int i = 1; i <= 5; i++)
        {
        	for (int a = 1; a <= i; a++)
        	{
        		System.out.print(a);
        	}
        	System.out.println();
        }
    }
}