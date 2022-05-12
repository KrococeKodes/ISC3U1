/*
 * 
 * Program Name: Factor.java
 * Last edited on March 25th, 2022
 * By: Lucas Chow
 * ICS3U1
 * 
 * This program prompts the user for an integer, and then prints out all the factors of the integer
 * 
 * */
import java.util.Scanner;

public class Factors
{

    public static void main(String[] args)
    {
        //declaring variables
    	int userInt;
        Scanner sc = new Scanner(System.in);
        
        //prompting user for an integer
        System.out.print("Enter an integer: ");
        userInt = sc.nextInt();
        sc.nextLine();
        
        //looping through the values of i, i <= user input, seeing if it is a factor of user input, and if so prints it out
        for (int i = 1; i <= userInt; i++)
        {
        	if (userInt % i == 0)
        	{
        		System.out.println(i);
        	}
        }
    }
}