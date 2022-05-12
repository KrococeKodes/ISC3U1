/*
 * 
 * Program Name:CountInt2.java
 * Last edited on March 23th, 2022
 * By: Lucas Chow
 * ICS3U1
 * 
 * This program lets the user to continuously enter whole numbers until they enter a negative number.
 * It then outputs the number of whole numbers inputed (excluding the negative number)
 * 
 * */
import java.util.Scanner;

public class CountInt2
{

    public static void main(String[] args)
    {
        //declaring variables
    	int totalInt, userInt;
        Scanner sc = new Scanner(System.in);
        
        
        //prompting user to enter a number until they enter a negative number
        totalInt = -1;
        do {
        	System.out.print("Enter a number: ");
        	userInt = sc.nextInt();
        	sc.nextLine();
        	totalInt++;
        	
        } while (userInt >= 0);
        
        //prints out the total number of 
        System.out.println("The total number of whole number integers is " + totalInt);
    }
}