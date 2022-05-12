/*
 * 
 * Program Name: SortThreeNumbers.java
 * Last edited on March 10th, 2022
 * By: Lucas Chow
 * ICS3U1
 * 
 * This program prompts the user for 3 whole numbers, then if all the inputs are neither zero nor negative,
 * it outputs the 3 numbers in ascending order, otherwise it outputs an error message. This utilizes nested if brackets. 
 * 
 * Creator's note: The sorting algorithm took me way too long, (I even made a flow chart), probably harder than CCC S3 
 * 
 * */

import java.util.*;

public class SortThreeNumbers
{

    public static void main(String[] args)
    {
        //declaring variables
    	int a,b,c;
    	
        Scanner sc = new Scanner(System.in);
        
        //prompting user for numbers 1, 2 & 3
        System.out.print("Insert number 1: ");
        a = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Insert number 2: ");
        b = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Insert number 3: ");
        c = sc.nextInt();
        sc.nextLine();	
        
        //The algorithm that sorts the values from least to greatest for the 3 values, and outputs the numbers in ascending order
        if (!(a <= 0 || b <= 0 || c <= 0))
        {
        	if (a <= b)
        	{
        		if (c <=b)
        		{
        			if (a <= c)
        			{
        				System.out.printf("%d %d %d",a,c,b);

        			}
        			else
        			{
        				System.out.printf("%d %d %d",c,a,b);

        			}
        		}
        		else
        		{
        			System.out.printf("%d %d %d",a,b,c);

        		}
        			
        	}
        	else
        	{
        		if (b >= c)
        		{
        			System.out.printf("%d %d %d",c,b,a);

        		}
        		else
        		{
        			if (a >= c)
        			{
        				System.out.printf("%d %d %d",b,c,a);

        			}
        			else
        			{
        				System.out.printf("%d %d %d",b,a,c);

        			}
        		}
        	}
        }
        else
        {
        	//error if 
        	System.out.println("Error");
        }
        
    }
}