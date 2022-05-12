/*
 * 
 * Program Name:CountInt1.java
 * Last edited on March 23th, 2022
 * By: Lucas Chow
 * ICS3U1
 * 
 * This program allows the user to input integers until they enter -1,
 * in that case it exits the loop and prints the number of integers they inputed, excluding -1
 * 
 * */
import java.util.Scanner;

public class CountInt1
{

    public static void main(String[] args)
    {
        //declaring variables
    	int totalInt, userInt;
        Scanner sc = new Scanner(System.in);
        
        
        //prompting user for a number, until the number is -1
        totalInt = -1;
        do {
        	System.out.print("Enter a number: ");
        	userInt = sc.nextInt();
        	sc.nextLine();
        	totalInt++;
        	
        } while (userInt != -1);
        
        //prints out the number of integers inputed (excluding -1 exit number)
        System.out.println("The total number of integers is " + totalInt);
    }
}