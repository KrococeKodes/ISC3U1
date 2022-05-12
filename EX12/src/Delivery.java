/*
 * 
 * Program Name: Delivery.java
 * Last edited on March 11th, 2022
 * By: Lucas Chow
 * ICS3U1
 * 
 * This program prompts the user for the weight and dimensions of a package
 * and determines if the package is allowed to pass through, and fits in the restrictions, 
 * then outputs the price if the dimensions fit
 * 
 * */
import java.util.Scanner;

public class Delivery
{

    public static void main(String[] args)
    {
        //declaring variables
    	double length, height, width, volume, price, weight;
    	boolean goodSize, goodWeight;
        Scanner sc = new Scanner(System.in);
        
        //prompting user for weight
        System.out.print("Please insert the weight: ");
        weight = sc.nextDouble();
        sc.nextLine();
        
        //prompting user for length, width, and height
        System.out.print("Please insert length of package in cm: ");
        length = sc.nextDouble();
        sc.nextLine();
        
        System.out.print("Please insert width of package in cm: ");
        width = sc.nextDouble();
        sc.nextLine();
        
        System.out.print("Please insert height of package in cm: ");
        height = sc.nextDouble();
        sc.nextLine();
        
        //calculates volume
        volume = length * height * width;
        
        //checks if size of package is not too big
        if (volume >= 100000 )
        {
        	System.out.println("Too big");
        	goodSize = false;
        }
        else
        {
        	goodSize = true;
        }
        
        //checks if weight is acceptable
        if (weight > 27)
        {
        	System.out.println("Too heavy");
        	goodWeight = false;
        }
        else if (weight <= 0)
        {
        	System.out.println("You cannot have weight <= 0! \nWe do not ship helium!!");
        	goodWeight = false;
        }
        else
        {
        	goodWeight = true;
        }
        
        //if both parameters are fulfilled, the price is determined for the package
        if (goodWeight && goodSize)
        {
        	
    		if (weight <= 5)
    		{
    			System.out.printf("Price: $%,.2f\n",weight*3);
    		}
    		else if (weight > 5 && weight <= 12)
    		{
    			System.out.printf("Price: $%,.2f\n",weight*3.5);
    		}
    		else if (weight > 12 && weight <= 20)
    		{
    			System.out.printf("Price: $%,.2f\n",weight*4);
    		}
    		else if (weight > 20 && weight <=27)
    		{
    			System.out.printf("Price: $%,.2f\n",weight*4.5);
    		}
    	}
    		
    }
        
}
