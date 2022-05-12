/*
 * 
 * Program Name: Sum.java
 * Last edited on March 23th, 2022
 * By: Lucas Chow
 * ICS3U1
 * 
 * This program calculates the sum of whole numbers the user inputs, and stops
 * prompting the user and outputs the total sum when the input is negative
 * 
 * */
import java.util.Scanner;

public class Sum
{

    public static void main(String[] args)
    {
        //declaring variables
        int userInt, total;
    	Scanner sc = new Scanner(System.in);
        
        
        //prompting user for a number, adding it to total
    	total = 0;
        do {
        	System.out.print("Enter a number: ");
        	userInt = sc.nextInt();
        	sc.nextLine();
        	if (userInt >= 0 )
        	{
        		total = total + userInt;
        	}
        }
        while (userInt >= 0);
        
        
        
        //printing out the total
        System.out.println(total);
    }
}