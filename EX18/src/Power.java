/*
 * 
 * Program Name: Power.java
 * Last edited on March 25th, 2022
 * By: Lucas Chow
 * ICS3U1
 *
 * This program calculates X^N, X is a floating point number and N is a positive integer, outputting the 
 * value of X^N, and outputs an error message instead of the value of X^N if N < 0
 * 
 * */
import java.util.Scanner;

public class Power
{

    public static void main(String[] args)
    {
        //declaring variables
    	double inputBase, product;
    	int inputExponent;
        Scanner sc = new Scanner(System.in);
        
        //prompting user for X and N
        System.out.println("Enter X");
        inputBase = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter N");
        inputExponent = sc.nextInt();
        sc.nextLine();
        
        //if N is < 0, outputs error message
        if (inputExponent < 0)
        {
        	System.out.println("\nN must be a positive integer.");
        }
        else
        {
        	//if no error, calculates the product, and prints out the respective values
        	product = Math.pow(inputBase, inputExponent);
            
            System.out.printf("\n%.1f raised to the power %d is: %.5f",inputBase, inputExponent, product);
            
        }
        
        
    }
}