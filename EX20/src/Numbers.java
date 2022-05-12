/*
 * 
 * Program Name: Numbers.java
 * Last edited on April 6, 2022
 * By: Lucas Chow
 * ICS3U1
 * 
 * This program prompts the user 6 values in the array,
 * prints them in reverse order, adds 10% to the numbers,
 * and if they are greater than 50, prints out that value
 * 
 * */
import java.util.*;

public class Numbers
{

    public static void main(String[] args)
    {
        //declaring variables and objects
    	double[] numArr;
    	numArr = new double[6];
        Scanner sc = new Scanner(System.in);
        
        
        //prompts user for doubles as values in the array
        for (int i = 0; i < 6; i++)
        {
        	System.out.print("Enter a number: ");
        	numArr[i] = sc.nextDouble();
        	sc.nextLine();
        	
        }
        //prints the numbers backwards
        
        System.out.println("Numbers printed backwards: ");
        for (int i = 5; i > -1; i--)
        {
        	System.out.println(numArr[i]);
        }
        
        //increasing numbers by 10%
        System.out.println("Numbers increased by 10% that are greater than 50");
        for (int i = 0; i < 6; i++)
        {
        	numArr[i] = numArr[i] * 1.1;
        	
        	//if number is greater than 50, prints out that value
        	if (numArr[i] > 50)
        	{
        		System.out.println(numArr[i]);
        	}
        }
        
    
    }
}