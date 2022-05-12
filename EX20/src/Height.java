/*
 * 
 * Program Name: Height.java
 * Last edited on April 6, 2022
 * By: Lucas Chow
 * ICS3U1
 * 
 * This program prompts the user for the height of 20 people, and outputs the
 * people who have heights greater than the average.
 * 
 * */
import java.util.*;

public class Height
{

    public static void main(String[] args)
    {
        //declaring variables and objects
    	double avHeight;
    	double[] arrHeight;
    	arrHeight = new double[20];
        Scanner sc = new Scanner(System.in);
        
        //prompting user for person's height 1 - 20
    	for (int i = 0; i < 20; i++)
    	{
    		System.out.print("Enter height of person #"+(i+1)+": ");
    		arrHeight[i] = sc.nextInt();
    		sc.nextLine();
    	}
    	
    	//calculating the average height
    	avHeight = 0;
    	
    	for (int i = 0; i < 20; i++)
    	{
    		avHeight += arrHeight[i];	
    	}
    	
    	avHeight =  avHeight /20;
    	System.out.println("Average height is "+ avHeight);
    	
    	
    	//outputting the person's number and their height if they are greater than the average height
    	for (int i = 0; i <20; i++)
    	{
    		if (arrHeight[i] > avHeight)
    		{
    			System.out.println("Person #"+(i+1)+" who is " +arrHeight[i] + " units tall is greater than the average height");
    		}
    	}
    }
}