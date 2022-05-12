/*
 * 
 * Program Name: NumberSum.java
 * Last edited on March 25th, 2022
 * By: Lucas Chow
 * ICS3U1
 * 
 * This program first prompts the user for a n, representing number of numbers, they prompts the user
 * n times for integers to be added, then outputs the sum of all the integers
 * 
 * */
import java.util.Scanner;

public class NumberSum
{

    public static void main(String[] args)
    {
        //declaring variables
    	int numInt, userInput,sum;
        Scanner sc = new Scanner(System.in);
        
        //prompting user for number of numbers to be added
        System.out.println("How many integers will be added?");
        numInt = sc.nextInt();
        sc.nextLine();
        
        //setting sum to 0
        sum = 0;
        
        //looping through the number of numbers and prompting the user for an integer
        for (int i = 0; i < numInt; i++)
        {
        	System.out.println("Enter an integer:");
        	userInput = sc.nextInt();
        	sc.nextLine();
        	sum += userInput; 
        }
        
        //Outputting the sum of the numbers
        System.out.println("The sum is " + sum);
    }
}