/*
 * 
 * Program Name: Stages.java
 * Last edited on March 10th, 2022
 * By: Lucas Chow
 * ICS3U1
 * 
 * This program prompts the user for their age, and prints out their age group,
 * for the age range they fall under (adult, teen, preteen, child, toddler)
 * 
 * */
import java.util.Scanner;

public class Stages
{

    public static void main(String[] args)
    {
        //declaring variables
    	int userAge;
        Scanner sc = new Scanner(System.in);
        
        //prompting user for their age
        System.out.print("Insert age: ");
        userAge = sc.nextInt();
        sc.nextLine();
        
        //checks what age group the user is in and outputs the respective age group
        if (userAge > 18)
        {
        	System.out.println("adult");
        }
        else if (userAge <= 18)
        {
        	if (userAge <=5)
        	{
            	System.out.println("Toddler");	
        	}
        	else if (userAge > 5 && userAge <= 10)
        	{
        		System.out.println("Child");
        	}
        	else if (userAge > 10 && userAge <=12)
        	{
        		System.out.println("preteen");
        	}
        	else if (userAge > 12)
        	{
        		System.out.println("teen");
        	}
        }
    }
}